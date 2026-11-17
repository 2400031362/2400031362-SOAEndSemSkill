JWT Spring Boot Demo

Requirements:
- JDK 17 or newer
- Maven (or use the Maven wrapper/import Maven project in Eclipse)
- Postman (optional, for testing)

Run:
1. Extract the ZIP.
2. Import the extracted folder into Eclipse as an Existing Maven Project.
3. Wait for Maven dependencies to download.
4. Open src/main/java/com/example/demo/DemoApplication.java.
5. Right-click -> Run As -> Java Application (or Spring Boot App).
6. Confirm the console shows Tomcat started on port 8080.

Test in Postman:
- Method: POST
- URL: http://localhost:8080/generate-token
- Body -> raw -> JSON:

{
  "id": 101,
  "username": "Lokesh",
  "role": "ADMIN"
}

A successful response contains a message and a JWT token.

Note:
The secret key is hardcoded only for this learning/demo project. For production,
store a strong secret in a secure environment variable or secret manager.
