FROM alpine:3.17

ARG version=17.0.7.7.1

COPY target/demo-0.0.1-SNAPSHOT.jar porfolio-app.jar

ENTRYPOINT ["java", "-jar", "porfolio-/app.jar"]