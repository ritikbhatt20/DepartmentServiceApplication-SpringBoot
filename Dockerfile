#compile and package my application
FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

#going to run my application, container
FROM openjdk:17-jdk-slim
COPY --from=build /target/Spring-boot-tutorial-0.0.1-SNAPSHOT.jar Spring-boot-tutorial.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","Spring-boot-tutorial.jar"]