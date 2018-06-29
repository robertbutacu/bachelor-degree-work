package functions.hierarchical.clustering.method

trait MethodType

case class SingleLinkage() extends MethodType
case class CompleteLinkage() extends MethodType
case class AverageLinkage() extends MethodType
