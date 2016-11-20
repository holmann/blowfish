/**
  * Created by terje on 15.11.2016.
  */
import java.io.File

import com.typesafe.config._

object Boot {
  def main(args: Array[String]): Unit = {
    println("Boot Blowfish")
  //  val parsedConfig = ConfigFactory.parseFile(new File("src/main/resources/application.conf"))
 //   val conf = ConfigFactory.load(parsedConfig)
    val conf = ConfigFactory.load()
//
    println("The answer to everything is " + conf.getString("application.answer"))
  }
}
