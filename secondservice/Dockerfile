FROM openjdk:21
LABEL authors="dipada"
ARG JAR_FILE=target/*.jar
COPY ./target/*.jar app.jar
EXPOSE 10101
ENTRYPOINT ["java", "-jar", "/app.jar"]