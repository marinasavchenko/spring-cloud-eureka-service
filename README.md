## **Spring cloud eureka service**

Implementation of service discovery using Spring Cloud and Netflix Eureka service discovery agent.
When services are bootstrapping, they will register their IPs with the Eureka Service.
Ribbon will contact the Eureka service to retrieve service location information and then cache it locally.
When service instances are added/removed, they will update the service discovery agent and become available to process user requests.

## **Technology stack**

* Java 8
* Spring Boot 2
* Spring Cloud 2
* Netflix Eureka

* Maven
* Docker

## **Building**

To compile source code and build Docker image:
```
mvn clean package docker:build
```

## **Running**

To start service in Docker container:
```
docker run marinasavchenko/onlinestore-eurekasrv:v1
```

## **Running the tests**

To run tests via Maven:
```
mvn clean test
```