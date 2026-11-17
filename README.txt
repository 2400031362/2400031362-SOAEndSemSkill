# JWT Spring Boot Demo

A simple Spring Boot application that generates JSON Web Tokens (JWT) using user details.

## Project Structure

```text
jwt-spring-boot-demo/
│
├── src/
│   └── main/
│       ├── java/com/example/demo/
│       │   ├── DemoApplication.java
│       │   ├── JwtController.java
│       │   └── JwtService.java
│       │
│       └── resources/
│           └── application.properties
│
├── pom.xml
├── README.md
└── .gitignore
```

## Technologies Used

- Java 17
- Spring Boot
- Maven
- JSON Web Token (JWT)
- Postman

## Features

- JWT token generation
- User ID, username and role as token claims
- Token issue and expiration time
- REST API integration

## API Endpoint

**POST** `/generate-token`

Sample Request:

```json
{
  "id": 101,
  "username": "lokesh",
  "role": "USER"
}
```

## How to Run

1. Import the project into Eclipse as a Maven project.
2. Update Maven dependencies.
3. Run `DemoApplication.java`.
4. Test the API using Postman or any REST client.

**Server:** `http://localhost:8080`