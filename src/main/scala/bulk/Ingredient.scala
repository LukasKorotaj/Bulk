package bulk

case class Ingredient(weight: Double, proteinPer100g: Double, caloriesPer100g: Double):
  def protein:  Double = (weight / 100) * proteinPer100g
  def calories: Double = (weight / 100) * caloriesPer100g
