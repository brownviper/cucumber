import _root_.sbt.Keys._

name := "CucumberTest"

version := "1.0"

scalaVersion := "2.11.7"


libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.1",
  "org.scala-lang" % "scala-library" % "2.11.2",
  "info.cukes" % "cucumber-scala_2.11" % "1.2.2",
  "info.cukes" % "cucumber-junit" % "1.2.2",
  "info.cukes" % "cucumber-picocontainer" % "1.2.2",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "2.48.2",
  "org.seleniumhq.selenium" % "selenium-firefox-driver" % "2.45.0"
)