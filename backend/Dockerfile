FROM eclipse-temurin:17
MAINTAINER baeldung.com
RUN mkdir /app
COPY ./backend/app.jar /app/backend.jar
WORKDIR /app
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=local","/backend.jar"]
