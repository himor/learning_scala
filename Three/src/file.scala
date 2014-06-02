
import scala.io.Source

object file extends App {
  
  var msg: String = "Hello world";
  
  println(msg);
 
  def max(x:Int, y:Int):String =
    if (x > y) x.toString
    else y.toString
  
  def count_(x:Int):Unit = {
      if (x < 1) Unit
      else
      {
        var a = Math.random() * 10
	    var b = Math.random() * 10
	    print("a="  + a.toInt)
	    print(" b=" + b.toInt)
	    println(" max=" + max(a.toInt, b.toInt))
	    count_(x-1)
      }
    }
   
  var a = Array(1, 2)
  val b = new Array[Int](10)
  println(b)
  for (num <- a)
    count_(num)

  (0).to(2).foreach(f => count_(f))
    
  var simpleList = List(1, 2, 3)
  simpleList = simpleList ::: (9 :: List(3, 4))
  simpleList = simpleList.reverse
  for (num <- simpleList)
    println(num)
    
  val z = "one" :: "two" :: "two" :: "three" :: Nil
  z.foreach(zz => println(zz))
  
  val z_count = z.count(zz => zz == "two" )
  println(z_count)
  println(z.length)
  
  val newList = z.map(s => List(s))
  newList.foreach(zz => println(zz))
  
  println(newList.mkString(" ~ "))
  
  val q = new Another;
  
  q.add(48);
  q.add(12);
  println(q.checksum);


  
  
    
}