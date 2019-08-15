import scala.io._

object Hello {
    def main(args: Array[String]): Unit = {
        val helloText = "Hello"
        var word = StdIn.readLine()
        Console.println(helloText + " " + word)
    }
}
