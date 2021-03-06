name := "predictionio-admin"

version := "0.7.0-SNAPSHOT"

organization := "io.prediction"

libraryDependencies ++= Seq(
  "io.prediction" %% "predictionio-commons" % version.value,
  "io.prediction" %% "predictionio-output" % version.value,
  "commons-codec" % "commons-codec" % "1.8")

playAssetsDirectories <+= baseDirectory / "enginebase"

play.Project.playScalaSettings
