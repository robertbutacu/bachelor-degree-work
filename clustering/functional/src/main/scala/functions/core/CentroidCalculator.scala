package functions.core

import data.representation.{BidimensionalPoint, Cluster, TridimensionalPoint, UnidimensionalPoint}

trait CentroidCalculator[A, P[_], C[_, _[_]]] {
  def computeCentroid(cluster: C[A, P]): P[A]
}

object CentroidCalculator {
  object ops {
    implicit class CentroidOps[A: Numeric, P[_]](cluster: Cluster[A, P]) {
      def computeCentroid(): P[A] = CentroidCalculator[A, P].computeCentroid(cluster)
    }
  }

  def apply[A: Numeric, P[_]](implicit cc: CentroidCalculator[A, P, Cluster]) = cc

  implicit def unidimensionalPointsCentroid: CentroidCalculator[Double, UnidimensionalPoint, Cluster] =
    (cluster: Cluster[Double, UnidimensionalPoint]) => {
      val sum = cluster.points.foldRight(0.0)((curr, acc) => acc + curr.X)

      UnidimensionalPoint("Point " + cluster.name, sum / cluster.points.length)
    }

  implicit def bidimensionalPointsCentroid: CentroidCalculator[Double, BidimensionalPoint, Cluster] =
    (cluster: Cluster[Double, BidimensionalPoint]) => {
      val sum = cluster.points.foldRight((0.0, 0.0))((curr, acc) => (acc._1 + curr.X, acc._2 + curr.Y))

      val numberOfPoints = cluster.points.length
      BidimensionalPoint("Point " + cluster.name, sum._1 / numberOfPoints, sum._2 / numberOfPoints)
    }

  implicit def tridimensionalPointsCentroid: CentroidCalculator[Double, TridimensionalPoint, Cluster] =
    (cluster: Cluster[Double, TridimensionalPoint]) => {
      val sum = cluster.points.foldRight((0.0, 0.0, 0.0)) {
        (curr, acc) =>
          (acc._1 + curr.X, acc._2 + curr.Y, acc._3 + curr.Z)
      }

      val numberOfPoints = cluster.points.length

      TridimensionalPoint("Point " + cluster.name,
        sum._1 / numberOfPoints,
        sum._2 / numberOfPoints,
        sum._3 / numberOfPoints)
    }
}
