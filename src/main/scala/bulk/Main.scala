import bulk._
import java.io.{File, PrintWriter}

object Main:

  def inputString(): String =
    try
      scala.io.StdIn.readLine("> ").toLowerCase()
    catch 
      case e: IllegalArgumentException =>
        println("Invalid input")
        inputString()

  def inputDouble(): Double =
    try
      scala.io.StdIn.readLine("> ").toDouble
    catch
      case e: IllegalArgumentException =>
        println("Invalid input")
        inputDouble()
    
  def addIngredientToFile(): Unit =
    val name = inputString()
    val proteinPer100 = inputDouble()
    val caloriesPer100 = inputDouble()
    val file = File("ingredients.txt")
    val writer = PrintWriter(file)
    try
      writer.println(s"$name, $proteinPer100, $caloriesPer100")
    finally
      writer.close()
    
  @main def run(args: String*): Unit = 
    var continue = true
    while continue do
      println("""
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@                         BULK                          @
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Welcome to my simple meal and ingredient manager!

This script is designed to help you manager your meals to
help you get your macros!

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@                                                       @
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Options: 
1...Optimise Meal.
2...Add meal and recipe (optional).
3...Add ingredient(s).
4...Add spice(s).
5...Choose random meal.
6...Make a week plan (random or not).
7...List recipe for meal (option to save to file)
""")

