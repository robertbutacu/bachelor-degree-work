package functions.hierarchical.clustering.method

import data.representation.{Cluster, NewCluster}
import functions.core.DistanceCalculator

trait Method[A, P[_], D, M, C[_, _[_]]] {
  def formCluster(clusters: List[C[A, P]],
                  distanceType: D,
                  methodType: M)
                 (implicit distance: DistanceCalculator[A, P, D]): NewCluster[A, P]
}

object Method {

  object ops {

    implicit class MethodOps[MT <: MethodType](method: MT) {
      def formCluster[A, P[_], D](clusters: List[Cluster[A, P]], distanceType: D)
                                 (implicit distance: DistanceCalculator[A, P, D]): NewCluster[A, P] = {
        Method[A, P, D, MT, Cluster].formCluster(clusters, distanceType, method)
      }
    }

  }

  def apply[A, P[_], D, M, C[_, _[_]]](implicit method: Method[A, P, D, M, C]): Method[A, P, D, M, C] =
    method
}

