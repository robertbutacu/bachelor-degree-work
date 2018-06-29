package functions.hierarchical.clustering

import data.representation.{Cluster, NewCluster}
import functions.core.{CentroidCalculator, DistanceCalculator}
import functions.hierarchical.clustering.method.{Method, MethodType}
import Method.ops.MethodOps
import scala.annotation.tailrec

object ClusteringAlgorithm {
  def clusterize[A: Numeric, P[_], D](clusters: List[Cluster[A, P]],
                                      distanceType: D,
                                      method: MethodType)
                                     (implicit distance: DistanceCalculator[A, P, D]): Cluster[A, P] = {
    @tailrec
    def go(clusters: List[Cluster[A, P]],
           method: MethodType,
           currentIndex: Int = 0)(implicit distance: DistanceCalculator[A, P, D]): Cluster[A, P] = {
      if (clusters.size == 1)
        clusters.head
      else {
        val next = method.formCluster(clusters, distanceType)

        def isMergedIntoANewCluster(c: Cluster[A, P]) = c == next.first || c == next.second

        def updateClusters(): List[Cluster[A, P]] =
          clusters.filterNot(isMergedIntoANewCluster) ++ List(NewCluster.createCluster(next, currentIndex))

        go(updateClusters(),
          method,
          currentIndex + 1)
      }
    }

    go(clusters, method)
  }
}