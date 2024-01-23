# Usa una imagen base con Java 8
FROM openjdk:8-jdk-alpine
COPY "./target/gateway-biometrico-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 9001
ENTRYPOINT ["java", "-jar", "/app.jar"]
