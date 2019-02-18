FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} target/app.jar
ENTRYPOINT ["java","-jar","target/app.jar"]