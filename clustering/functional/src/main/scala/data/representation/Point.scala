package data.representation

trait Point[A] {
  def name: String
}

case class UnidimensionalPoint[A: Numeric](name: String, X: A) extends Point[A]
case class BidimensionalPoint[A: Numeric](name: String, X: A, Y: A) extends Point[A]
case class TridimensionalPoint[A: Numeric](name: String, X: A, Y: A, Z: A) extends Point[A]

