import org.scalatest.{MustMatchers, WordSpec}


class CypherSpec extends WordSpec with MustMatchers {

  "Cypher" must  {

    "when provided with the letter A return the number 1" in {
      Cypher.keyMap("a") mustEqual 1
    }
  }

}
