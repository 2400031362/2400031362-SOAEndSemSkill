package com.example.demo;

import org.springframework.stereotype.Service;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import javax.crypto.SecretKey;
import java.util.Date;

@Service
public class JwtService {

    private final SecretKey key = Keys.hmacShaKeyFor(
        "MySecretKeyForJWTGeneration1234567890".getBytes()
    );

    public String generateToken(int id, String username, String role) {
        return Jwts.builder()
            .subject(username)
            .claim("id", id)
            .claim("role", role)
            .issuedAt(new Date())
            .expiration(new Date(System.currentTimeMillis() + 3600000))
            .signWith(key)
            .compact();
    }
}
