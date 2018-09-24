FROM maven:3.5-jdk-8-alpine AS build 
COPY ./server/src /usr/src
COPY ./server/pom.xml /usr/src
RUN mvn -f /usr/src/pom.xml clean install

FROM openjdk:8-jre-alpine
COPY ./server/src/main/resources/application.properties .
COPY --from=build /usr/src/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]