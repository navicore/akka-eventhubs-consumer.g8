[![Build Status](https://travis-ci.org/navicore/akka-eventhubs-consumer.g8.svg?branch=master)](https://travis-ci.org/navicore/akka-eventhubs-consumer.g8)

A [g8] Template for EventHubs, AKKA Streams, and AKKA HTTP
---

## PREREQ

  * sbt >= 13.16

## USAGE

Interactively prompt for details like your project name and package name:

```console
sbt new navicore/akka-eventhubs-consumer.g8 
```

Or oneshot via cli:

  * install giter8
    * via [g8 setup]
    * or just `brew install giter8`

```console
g8 git@github.com:navicore/akka-eventhubs-consumer.g8.git --name=YOUR_PROJECT_NAME  --package=YOUR.PACKAGE.NAME
```

[g8]: http://www.foundweekends.org/giter8/
[g8 setup]: http://www.foundweekends.org/giter8/setup.html 

## DEVELOPING

while developing the template, test using something like:

```console
sbt new file:///Users/navicore/git/navicore/akka-eventhubs-consumer.g8
```
 
