from adoptopenjdk:17.0.6_9-jdk-hotspot

copy target/demo-0.0.1-SNAPSHOT.jar app.jar

entrypoint ["java", "-jar", "/app.jar"]