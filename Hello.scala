import scala.io._

object Hello {
    def main(args: Array[String]): Unit = {
        var helloWorldText = ("Hello", "World")
        Console.println(helloWorldText._1 + " " + helloWorldText._2)
    }
}
