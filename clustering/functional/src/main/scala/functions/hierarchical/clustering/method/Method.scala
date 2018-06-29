package functions.hierarchical.clustering.method

import data.representation.{Cluster, NewCluster}
import functions.core.{CentroidCalculator, DistanceCalculator}

trait Method[A, P[_], D, M] {
  def formCluster(clusters: List[Cluster[A, P]],
                  distanceType: D,
                  methodType: M)
                 (implicit distance: DistanceCalculator[A, P, D],
                  centroidCalculator: CentroidCalculator[A, P, Cluster]): NewCluster[A, P]
}

object Method {

}
