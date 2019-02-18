# gradle_springboot2_microservice_security

## Build the application


`./gradlew build`

If you wish to use Docker you can additionally run the following to build the Docker image

`docker build --build-arg JAR_FILE=build/libs/*.jar -t gradle_springboot2_microservice_security .`


## Run the application

### Docker

`docker run -p 8080:8080 gradle_springboot2_microservice_security`

### Gradle

`./gradlew bootRun`

## Documentation

### Swagger

- http://localhost:8080/v2/api-docs
- http://localhost:8080/swagger-ui.html
