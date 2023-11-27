#compile and package my application
FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

#going to run my application, container
FROM openjdk:17-jdk-slim
COPY --from=build /target/Spring-boot-tutorial-1.0.0.jar Spring-boot-tutorial.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","Spring-boot-tutorial.jar"]

