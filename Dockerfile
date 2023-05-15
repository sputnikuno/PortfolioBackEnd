FROM alpine:3.17

COPY target/demo-0.0.1-SNAPSHOT.jar portfolio-app.jar

ENTRYPOINT ["java", "-jar", "portfolio-app.jar"]