package bulk

case class Meal(ingredients: List[Ingredient], spices: List[Spice]):
  def totalProtein: Double = ingredients.map(_.protein).sum
  def totalCalories: Double = ingredients.map(_.calories).sum
  def totalWeight: Double = ingredients.map(_.weight).sum
