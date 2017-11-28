import scala.math.random
import org.apache.spark._

object SparkPi {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("SparkPi").setMaster("local[2]")
    val spark = new SparkContext(conf)
    val slices = if(!args.isEmpty) args(0).toInt else 2
    val n = math.min(100000L * slices, Int.MaxValue).toInt
    val count = spark.parallelize(1 until n, slices).map{i =>
      val x = random * 2 - 1
      val y = random * 2  - 1
      if (x*x + y*y <1) 1 else 0
    }.reduce(_+_)
    println("Pi_is_roughly_" + 4.0 * count / n)
    spark.stop
  }

}
