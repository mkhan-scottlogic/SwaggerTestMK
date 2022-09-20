FROM openjdk:8-jdk-alpine
MAINTAINER mkhan.scottlogic.com
COPY target/SwaggerPoc-0.0.1-SNAPSHOT.jar SwaggerPoc-0.0.1.jar
ENTRYPOINT ["java","-jar","/SwaggerPoc-0.0.1.jar"]