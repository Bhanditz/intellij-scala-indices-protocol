name := "scala-compiler-indices-protocol"

organization := "io.github.sugakandrey"

version := "0.1.0"

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.12.6", "2.10.7")

libraryDependencies += "io.spray" %% "spray-json" % "1.3.4"

homepage := Some(url("https://github.com/JetBrains/intellij-scala-indices-protocol"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/JetBrains/intellij-scala-indices-protocol"),
    "git@github.com:username/projectname.git"
  )
)

developers := List(
  Developer(
    id    = "sugakandrey",
    name  = "Andrey Sugak",
    email = "andrey.sugak@jetbrains.com",
    url   = url("https://github.com/sugakandrey")
  )
)

licenses                += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
publishArtifact in Test := false
publishMavenStyle       := true

publishTo := {
  if (isSnapshot.value) Option(Opts.resolver.sonatypeSnapshots)
  else Option(Opts.resolver.sonatypeStaging)
}
