FROM java:8-alpine
MAINTAINER Ed Sweeney <ed@onextent.com>

EXPOSE 8080

RUN mkdir -p /app
COPY target/scala-$scalaVersion$/*.jar /app/

WORKDIR /app

CMD java -jar ./$name;format="camel"$.jar
# override CMD from your run command, or k8s yaml, or marathon json, etc...

