#FROM maven:3.8.6-openjdk-20.ea-b6 AS build
#COPY . .
#RUN mvn clean package -DskipTests
#
##container which we will be gonna use to run the application
#FROM openjdk:20-jdk-slim
#COPY --from=build /target/