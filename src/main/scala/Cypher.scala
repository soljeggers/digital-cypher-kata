object Cypher extends App {

  def numberReturn(letter: Char) : Int = {
    val generateMap = ('a' to 'z')
      .zip(1 to 26)
      .toMap

    generateMap(letter)
  }

  def stringConverter(word: String) : List[Int] = {
    word.toList.map(x => numberReturn(x))

  }

}