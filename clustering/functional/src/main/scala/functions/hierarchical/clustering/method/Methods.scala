package functions.hierarchical.clustering.method

import data.representation.{Cluster, NewCluster}
import functions.core.DistanceCalculator
import functions.core.CentroidCalculator.ops._

object Methods {
  implicit def singleLinkageMethod[A: Numeric, P[_], D, Cluster[_, _[_]]]: Method[A, P, D, SingleLinkage, Cluster] =
    new Method[A, P, D, SingleLinkage, Cluster] {
      override def formCluster(clusters: List[Cluster[A, P]],
                               distanceType: D,
                               methodType: SingleLinkage)
                              (implicit distance: DistanceCalculator[A, P, D]): NewCluster[A, P] = {
        def shortestDistance(current: Cluster[A, P], other: Cluster[A, P]): A = {
          val distancesBetweenAllPoints = for {
            currentPoint <- current.points
            otherPoint <- other.points
          } yield distance.computeDistance(currentPoint, otherPoint, distanceType)

          distancesBetweenAllPoints.minBy(d => d)
        }

        val shortestDistancesBetweenClusters = for {
          currentCluster <- clusters
          otherCluster <- clusters.filterNot(_ == currentCluster)
        } yield NewCluster(currentCluster, otherCluster, shortestDistance(currentCluster, otherCluster))

        shortestDistancesBetweenClusters.minBy(_.distanceBetween)
      }
    }

  implicit def averageLinkageMethod[A: Numeric, P[_], D, Cluster[_, _[_]]: Method[A, P, D, AverageLinkage, Cluster] =
    new Method[A, P, D, AverageLinkage] {
      override def formCluster(clusters: List[Cluster[A, P]],
                               distanceType: D,
                               methodType: AverageLinkage)
                              (implicit distance: DistanceCalculator[A, P, D]): NewCluster[A, P] = {
        val clustersWithCentroids = clusters zip (clusters map { c => c.computeCentroid() })

        val possibleClusters = for {
          from <- clustersWithCentroids
          to <- clustersWithCentroids filterNot (_ == from)
        } yield (from, to, distance.computeDistance(from._2, to._2, distanceType))

        val nextCluster = possibleClusters.minBy(_._3)
        NewCluster[A, P](nextCluster._1._1, nextCluster._2._1, nextCluster._3)
      }
    }

  implicit def completeLinkageMethod[A: Numeric, P[_], D, Cluster[_, _[_]]]: Method[A, P, D, CompleteLinkage, Cluster] =
    new Method[A, P, D, CompleteLinkage] {
      override def formCluster(clusters: List[Cluster[A, P]],
                               distanceType: D,
                               methodType: CompleteLinkage)
                              (implicit distance: DistanceCalculator[A, P, D]): NewCluster[A, P] = {
        def shortestDistance(current: Cluster[A, P], other: Cluster[A, P]): A = {

          val distancesBetweenAllPoints = for {
            currentPoint <- current.points
            otherPoint <- other.points
          } yield distance.computeDistance(currentPoint, otherPoint, distanceType)

          distancesBetweenAllPoints.max
        }

        val shortestDistancesBetweenClusters = for {
          currentCluster <- clusters
          otherCluster <- clusters.filterNot(_ == currentCluster)
        } yield NewCluster(currentCluster, otherCluster, shortestDistance(currentCluster, otherCluster))

        shortestDistancesBetweenClusters.minBy(_.distanceBetween)
      }
    }
}
