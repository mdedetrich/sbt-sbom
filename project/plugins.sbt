libraryDependencies += "org.scala-sbt"        %% "scripted-plugin" % sbtVersion.value
addSbtPlugin("org.scalameta"  % "sbt-scalafmt"       % "2.5.2")
addSbtPlugin("com.github.sbt" % "sbt-ci-release"     % "1.8.0")
addSbtPlugin("com.github.sbt" % "sbt-github-actions" % "0.24.0")
