import scala.collection.mutable._

object tres extends App {
	
  var cap = new HashMap[String, Int]()
  
  cap += ("One" -> 1, "Two" -> 2)
  cap += ("Three" -> 3)
  
  println(cap("Three"))
  
  def fact(x:BigInt): BigInt =
    if (x == 0) 1
    else x * fact(x-1)

  /**
   * Calculation of fibonacci sequence with caching
   */
  var m = Map[Int, BigInt]()
  def fib(x:Int): BigInt = {
	    if (m.contains(x)) m(x)
	    else if (x == 0) 0
	    else if (x == 1) 1
	    else {
	      val q = fib(x-1) + fib(x-2)
	      m += (x -> q)
	      q
	    }
    }
    
  println(fib(40));
  
  Storage.put("one", 2);
  Storage.put("one", 1);
  Storage.put("three", "number three");
  
  println(Storage.get("one"));
  println(Storage.get("two"));
  println(Storage.get("three"));
  
  
	
}