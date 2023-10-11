package com.example.userlogin.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;

import org.springframework.stereotype.Service;

@Service
public class JwtTokenService {
    
    private Key secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS512);

    public String generateToken(String username) {
        
        return Jwts.builder()
                .setSubject(username)
                .signWith(secretKey, SignatureAlgorithm.HS512)
                .compact();
    }
}

