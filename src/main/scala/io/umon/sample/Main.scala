package io.umon.sample

import scala.collection.mutable
import scala.io.Source

case class Person(age: Int, name: String, job: String)

object Main {

  def main(args: Array[String]): Unit = {

    require(args.length == 1)

    val counts = mutable.Map.empty[String, Int]

    for (line <- Source.fromFile(args(0)).getLines(); word <- line.split(" ")) {
      val oldCount = if (counts.contains(word)) counts(word) else 0
      counts += (word -> (oldCount + 1))
    }

    println(counts)

  }

}
