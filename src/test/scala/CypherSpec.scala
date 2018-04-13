import org.scalatest.{MustMatchers, WordSpec}


class CypherSpec extends WordSpec with MustMatchers {

  "Cypher" must {

    "when provided with the string 'a' return an Int of 1" in {
      Cypher.numberReturn('a') mustEqual 1
    }

    "when provided with the string 'ab' return a the List(1,2) " in {
      Cypher.stringConverter("ab") mustEqual List(1,2)
    }

    "when provided with the string 'cab' return the List(3,1,2) " in {
      Cypher.stringConverter("cab") mustEqual List(3,1,2)
    }

  }

}
