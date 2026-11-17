package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Map;

@RestController
public class JwtController {

    @Autowired
    private JwtService service;

    @PostMapping("/generate-token")
    public Map<String, String> generateToken(
        @RequestBody Map<String, Object> data) {

        int id = ((Number) data.get("id")).intValue();
        String username = data.get("username").toString();
        String role = data.get("role").toString();

        String token = service.generateToken(id, username, role);

        return Map.of(
            "message", "Token Generated Successfully",
            "token", token
        );
    }
}
