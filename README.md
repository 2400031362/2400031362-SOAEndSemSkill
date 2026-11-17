# JWT Spring Boot Demo

A Spring Boot application that generates JSON Web Tokens (JWT) using user details.

## Technologies Used
- Java 17
- Spring Boot 3.4.5
- Maven
- JSON Web Token (JJWT 0.12.6)
- Eclipse IDE

## Project Structure

```text
JWT-Spring-Boot-Project/
│
├── .settings/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── demo/
│       │               ├── DemoApplication.java
│       │               ├── JwtController.java
│       │               └── JwtService.java
│       │
│       └── resources/
│           └── application.properties
│
├── target/
│   └── classes/
│
├── .classpath
├── .project
├── .gitignore
├── pom.xml
└── README.md
```

## Features
- Generates JWT tokens.
- Uses HS256 algorithm.
- Token expiration set to 1 hour.
- Accepts user ID, username and role.

## API Endpoint

**Method:** POST

**URL:** `http://localhost:8080/generate-token`

**Request Body:**

```json
{
  "id": 101,
  "username": "Lokesh",
  "role": "ADMIN"
}
```

**Response:** Returns a success message and generated JWT token.

## How to Run
1. Import the project into Eclipse as an Existing Maven Project.
2. Wait for Maven dependencies to download.
3. Run `DemoApplication.java` as a Java Application.
4. Test the API using YARC REST Client or Postman.
