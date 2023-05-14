FROM amazoncorretto:11-alpine.jdk

COPY target/demo-0.0.1-SNAPSHOT.jar porfolio-app.jar

ENTRYPOINT ["java", "-jar", "porfolio-/app.jar"]