FROM eclipse-temurin:17
MAINTAINER baeldung.com
COPY build/libs/backend-0.0.1-SNAPSHOT.jar backend.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=local","/backend.jar"]
