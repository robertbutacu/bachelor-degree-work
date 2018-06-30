package functions.hierarchical.clustering.method

import Methods._
import data.representation.{Cluster, NewCluster}
import functions.core.{CentroidCalculator, DistanceCalculator}

trait Method[A, P[_], D, M] {
  def formCluster(clusters: List[Cluster[A, P]],
                  distanceType: D,
                  methodType: M)
                 (implicit distance: DistanceCalculator[A, P, D]): NewCluster[A, P]
}

object Method {

  object ops {

    implicit class MethodOps[MT <: MethodType](method: MT) {
      def formCluster[A, P[_], D](clusters: List[Cluster[A, P]], distanceType: D)
                                 (implicit distance: DistanceCalculator[A, P, D]): NewCluster[A, P] = {
        Method[A, P, D, MT].formCluster(clusters, distanceType, method)
      }
    }

  }

  def apply[A, P[_], D, M](implicit method: Method[A, P, D, M]): Method[A, P, D, M] = method
}
