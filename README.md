[![Codacy Badge](https://api.codacy.com/project/badge/Grade/9ca551a9ebcb4dcf95ae4c9beba2b3f7)](https://www.codacy.com/app/navicore/akka-eventhubs-consumer.g8?utm_source=github.com&utm_medium=referral&utm_content=navicore/akka-eventhubs-consumer.g8&utm_campaign=badger)
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
 
