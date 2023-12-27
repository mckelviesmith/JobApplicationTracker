# Job Application Tracker


## Local Setup Guide

### Requirements

**Java 17** 

[JDK 17](https://www.oracle.com/java/technologies/downloads/#java17)

**Postgres**

`brew install postgres@14`

`brew services start postgres@14`

### Database Setup
This service uses a postgres database with migrations managed with flyway. 

**1. Create a new postgres db with** `psql`
```
postgres=# CREATE USER JobApplicationTracker WITH PASSWORD <'YourPassword'>;
postgres=# CREATE DATABASE JobApplicationTracker OWNER JobApplicationTracker;
postgres=# GRANT ALL PRIVILEGES ON DATABASE JobApplicationTracker to JobApplicationTracker;
```

**2. Connect to the new database**
```
postgres=# \c jobapplicationtracker jobapplicationtracker
You are now connected to database "jobapplicationtracker" as user "jobapplicationtracker".
```

**3. Connect the project to the database**

In `resources/application.properties` add the following:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/jobapplicationtracker
spring.datasource.username=jobapplicationtracker
spring.datasource.password=<YOUR_PASSWORD>
spring.jpa.hibernate.ddl-auto=none
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

**4. Configure Flyway**

Database migrations are configured with Flyway and are configured to run automatically
when running the service. 

In `resources/application.properties` add the following:

```
flyway.url=jdbc:postgresql://localhost:5432/jobapplicationtracker
flyway.schemas =jobapplicationtracker
flyway.user=jobapplicationtracker
flyway.password=<YOUR_PASSWORD>
```

Currently Flyway points to your local database. Later when we deploy the service, these values
will change and point to the remote database. 

### Run the service

``
./gradlew bootRun
``

To verify the service is up and running navigate to http://localhost:8080/hello and verify that
"hello" is displayed.