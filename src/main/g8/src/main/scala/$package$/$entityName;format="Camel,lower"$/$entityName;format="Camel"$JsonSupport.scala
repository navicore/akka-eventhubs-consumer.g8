package $package$.$entityName;format="Camel,lower"$

import $package$.models.{JsonSupport, Message}
import spray.json._

trait $entityName;format="Camel"$JsonSupport extends JsonSupport {

  implicit val $entityName;format="camel"$Format: RootJsonFormat[$entityName;format="Camel"$] = jsonFormat2(
    $entityName;format="Camel"$)
  implicit val $entityName;format="camel"$MessageFormat: RootJsonFormat[Message[$entityName;format="Camel"$]] =
    jsonFormat4(Message[$entityName;format="Camel"$])
}
