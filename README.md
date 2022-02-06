![](https://github.com/Lylio/image-repo/blob/master/logos/quarkus.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/mongodb.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/microservices.png?raw=true)

# Quarkus MongoDB Microservice

### Description
A Quarkus microservice demonstrating the ease and speed of this tech stack.

### Tech Stack
- Quarkus (JDK 11)
- MongoDB
- Maven

### Setup & Launch

#### MongoDB
1. Navigate to the root directory (where pom.xml is)
2. Run `docker-compose up` to start a containerised instance of MongoDB on port 27018.

#### Quarkus App
Still in the root directory, run `./gradlew quarkusDev`.

#### Postman
Test out the endpoints in Postman by importing the Quarkus-MongoDB-Microservice.postman_collection.json file.

#### Acknowledgments
Based on the Java Challengers article [Creating a Simple Microservice with Quarkus and MongoDB](https://javachallengers.com/creating-a-simple-microservice-with-quarkus-and-mongodb/).