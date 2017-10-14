package $package$.models

import java.util.{Date, UUID}

final case class Body(body: String)

final case class EhEnvelop(contents: Body)

final case class Message[T](
    id: UUID = java.util.UUID.randomUUID(),
    kind: String = "unknown",
    datetime: Date = new Date(),
    body: T
)

