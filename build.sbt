ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.12.12"
ThisBuild / version      := "0.1.0"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello"
  )