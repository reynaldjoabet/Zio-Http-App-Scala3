
// The simplest possible sbt build file is just one line:

scalaVersion := "3.3.3"

name := "Zio-Http-App-Scala3"
version := "1.0"

libraryDependencies += "dev.zio" %% "zio-http" % "3.0.0"

ThisBuild/ scalacOptions ++= Seq("-no-indent")
