name := "scaladoc-test"

version := "0.1-SNAPSHOT"

scalaSource in Compile := baseDirectory.value / "src" / "library"

autoAPIMappings := true

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % "1.0.6",
  "com.twitter" %% "util-core" % "6.45.0",
  "org.slf4j" % "slf4j-api" % "1.7.25",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)
