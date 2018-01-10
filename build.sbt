name := "scaladoc-test"

version := "0.1-SNAPSHOT"

scalaSource in Compile := baseDirectory.value / "src" / "library"

autoAPIMappings := true

apiMappings ++= {

  val jarFileFor = {
    for {
      entry <- (fullClasspath in Test).value
      module <- entry.get(moduleID.key)
    } yield {
      (module.organization, module.name) -> entry.data
    }
  }.toMap

  Map(
    jarFileFor(("org.scala-lang.modules", s"scala-xml_${scalaBinaryVersion.value}"))
      -> url(s"http://www.scala-lang.org/api/current/scala-xml/")
  ) ++ Map(
    jarFileFor(("org.slf4j", "slf4j-api"))
      -> url(s"https://www.slf4j.org/apidocs/")
  ) ++ Map(
    jarFileFor(("org.scala-lang", "scala-library"))
      -> url(s"http://www.scala-lang.org/api/${scalaVersion.value}/")
  ) ++ {
    Option(System.getProperty("sun.boot.class.path")).flatMap { classPath =>
      classPath.split(java.io.File.pathSeparator).filter(_.endsWith(java.io.File.separator + "rt.jar")).headOption
    }.map { jarPath =>
      Map(
        file(jarPath)
          -> url("http://docs.oracle.com/javase/8/docs/api")
      )
    } getOrElse {
      // If everything fails, jam in the Java 9 base module.
      Map(
        file("/modules/java.base")
          -> url("http://docs.oracle.com/javase/9/docs/api")

      )
    }
  }
}

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % "1.0.6",
  "com.twitter" %% "util-core" % "6.45.0",
  "org.slf4j" % "slf4j-api" % "1.7.25",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)
