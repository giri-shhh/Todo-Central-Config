FROM openjdk:8-jre-alpine
WORKDIR /app
COPY target/todo-central-config-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "todo-central-config-0.0.1-SNAPSHOT.jar"]