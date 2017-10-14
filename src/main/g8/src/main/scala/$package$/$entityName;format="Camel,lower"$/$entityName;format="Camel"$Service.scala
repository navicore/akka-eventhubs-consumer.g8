package $package$.$entityName;format="Camel,lower"$

import akka.actor._
import akka.util.Timeout
import com.microsoft.azure.reactiveeventhubs.ResumeOnError._
import com.microsoft.azure.reactiveeventhubs.SourceOptions
import com.microsoft.azure.reactiveeventhubs.scaladsl.EventHub
import com.typesafe.scalalogging.LazyLogging
import $package$.$entityName;format="Camel,lower"$.$entityName;format="Camel"$Service.Get
import $package$.streams.db.{DbSink, Holder}
import $package$.streams.utils.{Console, ExtractBodies}

object $entityName;format="Camel"$Service {
  def props(implicit timeout: Timeout) = Props(new $entityName;format="Camel"$Service)
  def name = "$entityName;format="camel"$Service"

  final case class Get(name: String)
}

class $entityName;format="Camel"$Service(implicit timeout: Timeout)
    extends Actor
    with LazyLogging {

  EventHub()
    .source(SourceOptions().fromSavedOffsets().saveOffsets())
    .alsoTo(Console())
    .via(ExtractBodies("$entityName;format="Camel,lower"$"))
    .via(Extract$entityName;format="Camel"$s())
    .to(DbSink[$entityName;format="Camel"$])
    .run()

  override def receive: PartialFunction[Any, Unit] = {
    case Get(name) =>
      def notFound(): Unit = sender() ! None
      context.child(name).fold(notFound())(_ forward Holder.Get())
  }

}
