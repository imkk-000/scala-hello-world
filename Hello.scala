import java.io

object Hello {
    def main(args: Array[String]): Unit = {
        val (helloText, worldText) = ("Hello", "World")
        Console.println(helloText + " " + worldText)
    }
}
