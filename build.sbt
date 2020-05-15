course := "progfun1"
assignment := "forcomp"

scalaVersion := "2.13.2"

scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"

testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v", "-s")
