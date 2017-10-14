package $package$.$entityName;format="Camel,lower"$

import akka.NotUsed
import akka.stream.scaladsl.Flow
import $package$.models.Message
import org.json4s.jackson.JsonMethods._
import org.json4s.{DefaultFormats, _}

object Extract$entityName;format="Camel"$s {

  implicit val formats: DefaultFormats.type = DefaultFormats

  def apply(): Flow[String, (String, $entityName;format="Camel"$), NotUsed] =
    Flow[String].map(s => parse(s).extract[Message[$entityName;format="Camel"$]].body).map(a => (a.name, a))
}

