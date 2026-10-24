# gradle_springboot2_microservice_security

[![build](https://github.com/Rob-Leggett/gradle_springboot2_microservice_security/actions/workflows/build.yml/badge.svg?branch=master)](https://github.com/Rob-Leggett/gradle_springboot2_microservice_security/actions/workflows/build.yml)

Example Spring Boot REST microservice exposing an `/orders` endpoint with OpenAPI documentation.

## Prerequisites

- Java 25 (e.g. Eclipse Temurin 25)
- Gradle 9.8 is provided by the Gradle wrapper (`./gradlew`), no local install required
- Docker (optional)

Built with Spring Boot 4.1 (Spring Framework 7, Jakarta EE 11) and springdoc-openapi 3.

## Build the application

`./gradlew build`

If you wish to use Docker you can additionally run the following to build the Docker image (based on `eclipse-temurin:25-jre-alpine`)

`docker build --build-arg JAR_FILE=build/libs/*.jar -t gradle_springboot2_microservice_security .`


## Run the application

### Docker

`docker run -p 8080:8080 gradle_springboot2_microservice_security`

### Gradle

`./gradlew bootRun`

### Endpoints

- `GET http://localhost:8080/orders`

## Documentation

### OpenAPI / Swagger UI

- http://localhost:8080/v3/api-docs
- http://localhost:8080/swagger-ui.html
