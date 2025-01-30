FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/manager-pro.jar app.jar

EXPOSE 8899

ENTRYPOINT ["java", "-jar", "app.jar"]