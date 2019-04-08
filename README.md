## **Spring cloud eureka service**

When services are bootstrapping, they will register their IPs with the Eureka Service.
Ribbon will contact the Eureka service to retrieve service location information and then cache it locally.

## **Building**

1. To compile source code and build Docker image:
```
mvn clean package docker:build
```

## **Running**

1. To start service in Docker container:
```
docker run marinasavchenko/onlinestore-eurekasrv:v1
```

## **Running the tests**

1.To run tests via Maven:
```
mvn clean test
```

## **Technology stack**

* Java
* Spring Boot
* Spring Cloud

* Maven
* Docker