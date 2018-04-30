name := "scala-akka-actor"

version := "0.1"

scalaVersion := "2.12.6"

lazy val akkaVersion = "2.5.12"

mainClass in (Compile, run) := Some("MainApp")


libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)