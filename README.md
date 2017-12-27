Scaladoc test project
=====================

    $ sbt
    > ++2.12.4
    [info] Setting version to 2.12.4
    [info] Reapplying settings...
    [info] Set current project to scaladoc-test (in build file:scaladoc-test/)
    > update
    [info] Updating {file:scaladoc-test/}scaladoc-test...
    [info] Done updating.
    > doc
    [info] Compiling 3 Scala sources to scaladoc-test/target/scala-2.12/classes...
    [info] Main Scala API documentation to scaladoc-test/target/scala-2.12/api...
    model contains 4 documentable templates
    [warn] scaladoc-test/src/library/scala/Oh.scala:6: Could not find any member to link for "scala.Null".
    [warn]   /** Nil of [[scala.Null]]. */
    [warn]   ^
    [warn] scaladoc-test/src/library/scala/Oh.scala:18: Could not find any member to link for "scala.Nothing".
    [warn]   /**
    [warn]   ^
    [warn] scaladoc-test/src/library/scala/Oh.scala:26: Could not find any member to link for "scala.String".
    [warn]   /** String of [[scala.String]] (aka [[java.lang.String]]). */
    [warn]   ^
    [warn] scaladoc-test/src/library/scala/Oh.scala:29: Could not find any member to link for "scala.Integer".
    [warn]   /** Zero of [[scala.Integer]]. */
    [warn]   ^
    [warn] four warnings found
    [info] Main Scala API documentation successful.
