package functions.core

import data._
import data.representation.{BidimensionalPoint, TridimensionalPoint, UnidimensionalPoint}

trait DistanceCalculator[A, P[_], D] {
  def computeDistance(A: P[A], B: P[A], distanceType: D): A
}

object DistanceCalculator {
  implicit def unidimensionalPointCalculator[D <: DistanceType]: DistanceCalculator[Double, UnidimensionalPoint, D] =
    (A: UnidimensionalPoint[Double], B: UnidimensionalPoint[Double], distanceType: D) => {
      distanceType match {
        case EuclideanDistance => Math.sqrt(Math.pow(A.X - B.X, 2))
        case ManhattanDistance => Math.abs(A.X - B.X)
        case ChebyshevDistance => Math.abs(A.X - B.X)
      }
    }

  implicit def bidimensionalPointCalculator[D <: DistanceType]: DistanceCalculator[Double, BidimensionalPoint, D] =
    (A: BidimensionalPoint[Double], B: BidimensionalPoint[Double], distanceType: D) => {
      distanceType match {
        case EuclideanDistance => Math.sqrt(Math.pow(A.X - B.X, 2) + Math.pow(A.Y - B.Y, 2))
        case ManhattanDistance => Math.abs(A.X - B.X) + Math.abs(A.Y - B.Y)
        case ChebyshevDistance => Math.max(Math.abs(A.X - B.X), Math.abs(A.Y - B.Y))
      }
    }

  implicit def tridimensionalPointCalculator[D <: DistanceType]: DistanceCalculator[Double, TridimensionalPoint, D] =
    (A: TridimensionalPoint[Double], B: TridimensionalPoint[Double], distanceType: D) => {
      distanceType match {
        case EuclideanDistance => Math.sqrt(Math.pow(A.X - B.X, 2) + Math.pow(A.Y - B.Y, 2) + Math.pow(A.Z - B.Z, 2))
        case ManhattanDistance => Math.abs(A.X - B.Y) + Math.abs(A.Y - B.Y) + Math.abs(A.Z - B.Z)
        case ChebyshevDistance => List(Math.abs(A.X - B.X), Math.abs(A.Y - B.Y), Math.abs(A.Z - B.Z)).max
      }
    }

  /**
    * Euclidean distance is represented by the formula:
    * Sqrt of sum by i ( Math.pow(Ai - Bi, 2))
    */


  /**
    * Manhattan distance is given by the formula:
    * Sum by i in Abs(Ai - Bi)
    */

  /**
    * Chebyshev distance is given by the formula:
    * Max from | Ai - Bi |
    */
}