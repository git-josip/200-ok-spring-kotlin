FROM gradle:5.2.1-jdk8-alpine as builder
USER root
WORKDIR /builder
ADD . /builder
RUN gradle bootJar --stacktrace

FROM openjdk:8-jre-alpine
WORKDIR /app
EXPOSE 8888
COPY --from=builder /builder/config-server/build/libs/config-server-1.0-SNAPSHOT.jar .
CMD ["java", "-jar", "config-server-1.0-SNAPSHOT.jar"]