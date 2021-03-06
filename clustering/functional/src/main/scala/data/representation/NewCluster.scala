package data.representation

case class NewCluster[A: Numeric, P[_]](first: Cluster[A, P], second: Cluster[A, P], distanceBetween: A)

object NewCluster {
  def createCluster[A: Numeric, P[_]](newCluster: NewCluster[A, P], creationIndex: Int): Cluster[A, P] =
    Cluster(newCluster.first.points ++ newCluster.second.points,
      creationIndex,
      Some(newCluster.first),
      Some(newCluster.second))
}