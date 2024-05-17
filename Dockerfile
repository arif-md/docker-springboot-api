FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/api.jar api.jar
ENTRYPOINT ["java", "-jar", "/api.jar"]