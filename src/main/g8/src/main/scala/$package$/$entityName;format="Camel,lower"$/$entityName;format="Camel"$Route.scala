package $package$.$entityName;format="Camel,lower"$

import akka.actor.ActorRef
import akka.http.scaladsl.model.{ContentTypes, HttpEntity, StatusCodes}
import akka.http.scaladsl.server.{Directives, Route}
import akka.pattern.ask
import ch.megard.akka.http.cors.scaladsl.CorsDirectives._
import com.typesafe.scalalogging.LazyLogging
import $package$.ErrorSupport
import $package$.$entityName;format="Camel,lower"$.$entityName;format="Camel"$Service.Get
import spray.json._

import scala.concurrent.Future

object $entityName;format="Camel"$Route
    extends $entityName;format="Camel"$JsonSupport
    with LazyLogging
    with Directives
    with ErrorSupport {

  def apply(service: ActorRef): Route =
    path(urlpath / "$entityName;format="Camel,lower"$" / Segment) { name =>
      logRequest(urlpath) {
        handleErrors {
          cors(corsSettings) {
            get {
              val f: Future[Any] = service ask Get(name)
              onSuccess(f) { (r: Any) =>
                {
                  r match {
                    case Some($entityName;format="camel"$: $entityName;format="Camel"$) =>
                      complete(HttpEntity(ContentTypes.`application/json`,
                                          $entityName;format="camel"$.toJson.prettyPrint))
                    case _ =>
                      complete(StatusCodes.NotFound)
                  }
                }
              }
            }
          }
        }
      }
    }
}
