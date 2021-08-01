package example

object ConfigureWardrobeApp extends App {

  object WardrobeCombinator{
    def generateCombinations(size: Int, elements: List[Int]): List[Int]= ???
  }
  type WardrobeCombinator =   WardrobeElements  => WardrobeCombinations
  val iterateElements: WardrobeElements  => WardrobeElementSize = ???
  val findCombinations:       WardrobeElementSize   => List[Int] = ???
  val groupCombinations:      List[Int]         => WardrobeCombinations = ???

  /**
   * 50, 75, 100, 120
   *
   * 250
   *
   * 50 * 5
   * 50 * 2 + 75 * 2
   * 50 * 1 + 100 * 2
   * 50 * 3 + 100 * 1
   * 75 * 2 + 50 * 2 //duplicated
   * 100 * 2 + 50 * 1 //duplicated
   * 100 * 1 + 50 * 3 //duplicated
   *
   * try to fill 250 with each number itself
   * check one + next column until > 250
   * check two + next column until > 250
   * until you're surpassing the value
   */

  type WardrobeElements = List[WardrobeElementSize]
  type WardrobeElementSize = Int
  type WallSize = Int
  type WardrobeCombinations = List[WardrobeCombination]
  type WardrobeCombination = List[ElementCombination]
  type ElementCombination = (ElementSize, ElementAmount)
  type ElementSize = Int
  type ElementAmount = Int

  val wardrobeElements = List(50, 100)
  val wardrobeSize = 250

  val combinations : WardrobeCombinator =
    iterateElements andThen
      findCombinations andThen groupCombinations
}

