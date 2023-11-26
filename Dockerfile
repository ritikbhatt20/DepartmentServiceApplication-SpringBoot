#compile and package my application
FROM maven:3.8.6-openjdk-20.ea-b6 AS build
COPY . .
RUN mvn clean package -DskipTests

#going to run my application, container
FROM openjdk:20-jdk-slim
COPY --from=build /target/Spring-boot-tutorial-1.0.0.jar Spring-boot-tutorial.jar
EXPOSE 8089
ENTRYPOINT ["java","-jar","Spring-boot-tutorial.jar"]