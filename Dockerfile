FROM openjdk:8-jdk-alpine
WORKDIR /usr/src
COPY ./server .
COPY ./server/src/main/resources/application.properties .