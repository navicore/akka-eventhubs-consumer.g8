package $package$

import akka.actor.ActorRef
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._
import com.microsoft.azure.reactiveeventhubs.ResumeOnError._
import com.typesafe.scalalogging.LazyLogging
import $package$.$entityName;format="Camel,lower"$.{$entityName;format="Camel"$Route, $entityName;format="Camel"$Service}

object Main extends App with LazyLogging with ErrorSupport {

  val $entityName;format="Camel,lower"$Service: ActorRef = actorSystem.actorOf(
    $entityName;format="Camel"$Service.props(timeout),
    $entityName;format="Camel"$Service.name)

  val route =
    HealthCheck ~
      $entityName;format="Camel"$Route($entityName;format="Camel,lower"$Service)

  Http().bindAndHandle(route, "0.0.0.0", port)
}
