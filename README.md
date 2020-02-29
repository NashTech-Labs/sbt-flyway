# sbt-flyway
Using Flyway to migrate database through SBT

The sample project showcase using Flyway on MySQL.

Sample commands:

`sbt flywayClean` - this will clean everything from your database

`sbt flywayMigrate` - this command will run your sql migration scripts on the database specified

`sbt flywayInfo` - this command will show you the contents of flyway_schema_history table. This is the table which keeps track of the all the migrations done
