import bulk._
import java.io.{File, PrintWriter}

object Main:

  def inputString(input: String): String =
    try
      scala.io.StdIn.readLine(input).toLowerCase()
    catch 
      case e: IllegalArgumentException =>
        println("Invalid input")
        inputString(input)

  def inputDouble(input: String): Double =
    try
      scala.io.StdIn.readLine(input).toDouble
    catch
      case e: IllegalArgumentException =>
        println("Invalid input")
        inputDouble(input)
    
  def addIngredientToFile(): Unit =
    val name = inputString("Name of the ingredient: ")
    val proteinPer100 = inputDouble("Insert protein per 100g: ")
    val caloriesPer100 = inputDouble("Insert calorie per 100g: ")
    val file = File("ingredients.txt")
    val writer = PrintWriter(file)
    try
      writer.println(s"$name, $proteinPer100, $caloriesPer100")
    finally
      writer.close()
    
  @main def run(args: String*): Unit = 
    var continue = true
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
""")
    while continue do
      println("""
Options: 
1...Optimise Meal.
2...Add meal and recipe (optional).
3...Add ingredient(s).
4...Add spice(s).
5...Choose random meal.
6...Make a week plan (random or not).
7...List recipe for meal (option to save to file)
8...Quit.
""")

      val selection = 
        scala.io.StdIn.readLine("> ")
      selection match
      case "1" => println("not implemented")
      case "2" => println("not implemented")
      case "3" => addIngredientToFile()
      case "4" => println("not implemented")
      case "5" => println("not implemented")
      case "6" => println("not implemented")
      case "7" => println("not implemented")
      case "8" => println("not implemented")
        println("Quitting...")
        Thread.sleep(1000)
        continue = false
      case _   => 
        println("Invalid")
        Thread.sleep(1000)
         

