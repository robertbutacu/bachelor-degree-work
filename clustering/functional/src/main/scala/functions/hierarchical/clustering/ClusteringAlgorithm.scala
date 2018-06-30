package functions.hierarchical.clustering

import data.representation.{Cluster, NewCluster}
import functions.core.DistanceCalculator
import functions.hierarchical.clustering.method.Method.ops.MethodOps
import functions.hierarchical.clustering.method.MethodType

import scala.annotation.tailrec

object ClusteringAlgorithm {
  def clusterize[A: Numeric, P[_], D](clusters: List[Cluster[A, P]],
                                      distanceType: D,
                                      method: MethodType)
                                     (implicit distance: DistanceCalculator[A, P, D]): Cluster[A, P] = {
    @tailrec
    def go(clusters: List[Cluster[A, P]],
           currentIndex: Int = 0)(implicit distance: DistanceCalculator[A, P, D]): Cluster[A, P] = {
      if (clusters.size == 1)
        clusters.head
      else {
        val next = method.formCluster(clusters, distanceType)

        def isMergedIntoANewCluster(c: Cluster[A, P]) = c == next.first || c == next.second

        def updateClusters(): List[Cluster[A, P]] =
          clusters.filterNot(isMergedIntoANewCluster) :+ NewCluster.createCluster(next, currentIndex)

        go(updateClusters(), currentIndex + 1)
      }
    }

    go(clusters)
  }
}