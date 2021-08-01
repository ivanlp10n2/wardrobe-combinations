package example

import example.ConfigureWardrobeApp.WardrobeCombinator
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class WardrobeSpec extends AnyWordSpec with Matchers {
  "A wardrobe combinator" when{
    "size: 250, elements: [50]" should{
      "return [(50,5)]" in{
        WardrobeCombinator.generateCombinations(250, List(50)) shouldBe
          List(50,5)
      }
    }
    "size 250, elements: [50, 100] " should{
      "return [(50,5), ((50,3),(100,2)), ((50,1), (100,2))] " in {
        pending
        WardrobeCombinator.generateCombinations(250, List(50, 100)) shouldBe
          List(List(50,5), List((50,3),(100,2)), List((50,1), (100,2)))
      }
    }
    "size 250, elements: [50, 100, 150]" should{
      "return [ (50,5), " +
              " ((50,3),(100,2))," +
              " ((50,1), (100,2))," +
              " ((50,2), (150, 2))  ]" in{
        pending
        WardrobeCombinator
          .generateCombinations(250, List(50, 100)) shouldBe
            List( List(50,5),
                  List((50,3),(100,2)),
                  List((50,1), (100,2)),
                  List((50,2), (150,2)))

      }
    }
  }
}
