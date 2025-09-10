FROM openjdk:17

WORKDIR /app

COPY target/MyJavaProject-0.0.1-SNAPSHOT.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]

