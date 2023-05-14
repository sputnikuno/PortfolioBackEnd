from amazoncorretto:17-alpine-jdk

copy target/demo-0.0.1-SNAPSHOT.jar app.jar

entrypoint ["java", "-jar", "/app.jar"]