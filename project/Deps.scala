import sbt._
import sbt.Keys._
import StringUtilities.normalize


object Deps {
  def lib(m: ModuleID) = libraryDependencies += m
  lazy val sbtIo = Def.setting { "org.scala-sbt" % "io" % sbtVersion.value }
  lazy val sbtCompileInterface = Def.setting("org.scala-sbt" % "interface" % sbtVersion.value)
  lazy val scalacheck = "org.scalacheck" %% "scalacheck" % "1.11.4"
  lazy val specs2 = "org.specs2" %% "specs2" % "2.3.11"
  lazy val junit = "junit" % "junit" % "4.11"

  // TODO - these should be like the above, just ModuleIDs
  lazy val ivy = "org.scala-sbt.ivy" % "ivy" % "2.3.0-sbt-fccfbd44c9f64523b61398a0155784dcbaeae28f"
  lazy val scalaCompiler = Def.setting("org.scala-lang" % "scala-compiler" % scalaVersion.value)
}
