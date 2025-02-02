FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/api-auth.jar app.jar

EXPOSE 8899

ENTRYPOINT ["java", "-jar", "app.jar"]