# BBG Blood on the Clocktower Stats

## Description

The purpose of this app is to provide a tool to track the Blood on the Clocktower games of the BBG community and gain some insights on game statistics.

## Setup Application

1. The first step to setup the application is to have a database running. We are using MariaDB database.

```bash
cd database
docker compose up
```

2. The backend can be started using the corresponding bootRun Gradle Task.

```bash
./gradlew bootRun --args='--spring.profiles.active=dev'
```