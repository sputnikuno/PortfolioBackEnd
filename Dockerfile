FROM alpine:3.14

ARG version=8.372.07.1

COPY target/demo-0.0.1-SNAPSHOT.jar portfolio-app.jar

ENTRYPOINT ["java", "-jar", "portfolio-app.jar"]
