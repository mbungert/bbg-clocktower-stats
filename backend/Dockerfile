FROM eclipse-temurin:17
MAINTAINER baeldung.com
COPY app.jar backend.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=local","/backend.jar"]
