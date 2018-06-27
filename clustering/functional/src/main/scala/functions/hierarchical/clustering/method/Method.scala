package functions.hierarchical.clustering.method

import data.representation.{Cluster, NewCluster}
import functions.core.DistanceCalculator

trait Method {
  def formCluster[A, P[_], D](clusters: List[Cluster[A, P]],
                              distanceType: D)(implicit distance: DistanceCalculator[A, P, D]): NewCluster[A, P]
}

object Method {

}
