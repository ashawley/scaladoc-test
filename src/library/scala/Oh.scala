/**
 * "Oh, Scala!"
 */
object Oh {

  /** Nil of [[scala.Null]]. */
  var nil: Null = _

  /** Yes of [[java.lang.Object]]. */
  def yes = new Object

  /** No throws [[java.lang.Throwable]]. */
  def no = throw new Throwable

  /** Yeses forever [[scala.collection.Iterator]]. */
  def yessss: Iterator[Object] = Iterator.continually(yes)

  /**
   * Nos as [[scala.collection.Iterator]] of [[scala.Nothing]].
   */
  def nooooo = Iterator.continually(no).buffered

  /** Yes and no as [[scala.collection.Seq]] of length one. */
  def yesAndNo = yessss.zip(no).take(1).toSeq // Throws?

  /** String of [[scala.String]] (aka [[java.lang.String]]). */
  override def toString: String = nil

  /** Zero of [[scala.Integer]]. */
  def zero = 0

  /** One of [[scala.Long]]. */
  def One = 1l

  /** xml of [[scala.xml.Elem]] */
  val xml: scala.xml.Elem = <o/>

}
