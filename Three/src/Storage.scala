import scala.collection.mutable._

/**
 * Singleton class which can store Int and String variables
 */
object Storage {

  private val cacheInt = Map[String, Int]()
  private val cacheStr = Map[String, String]()

  def put(s: String, i: Any) =
    i match {
      case i: Int => {
        if (cacheInt.contains(s)) {
          cacheInt -= s
          cacheInt += (s -> i)
        } else {
          cacheInt += (s -> i)
        }
      }
      case i: String => {
        if (cacheStr.contains(s)) {
          cacheStr -= s
          cacheStr += (s -> i)
        } else {
          cacheStr += (s -> i)
        }
      }
    }

  def get(s: String): Any =
    if (cacheInt.contains(s))
      cacheInt(s)
    else if (cacheStr.contains(s))
      cacheStr(s)
    else
      false;

}