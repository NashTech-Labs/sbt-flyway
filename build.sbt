
enablePlugins(FlywayPlugin)

version := "0.0.1"
name := "sbt-flyway-sample"

libraryDependencies += "mysql" % "mysql-connector-java" % "6.0.6"

flywayUrl := "jdbc:mysql://localhost:3306/test_flyway"
flywayUser := "root"
flywayPassword := "password"
flywayLocations += "db/migration"

