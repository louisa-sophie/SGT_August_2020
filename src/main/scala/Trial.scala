import scala.io.Source

object Trial extends App{
  //val fileName = "/Users/louisaloennies/IdeaProjects/SGT_August_2020/src/main/scala/cook_book_1"
  //for (line  <- Source.fromFile(fileName). getLines){println (line)}

  for(line <- Source.fromResource("cook_book_1"). getLines){println (line)}


}
