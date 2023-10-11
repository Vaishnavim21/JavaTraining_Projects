package com.example.userlogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.userlogin.service.JwtTokenService;
import com.example.userlogin.service.UserService;
import com.example.userlogin.userClass.User;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private JwtTokenService jwtTokenService;

    // This variable stores the JWT token after successful login
    private String loggedInJwtToken = null;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        boolean isAuthenticated = userService.authenticate(user.getUsername(), user.getPassword());

        if (isAuthenticated) {
            // Generate a JWT token and store it
            loggedInJwtToken = jwtTokenService.generateToken(user.getUsername());

            // Return a success response with the JWT token
            return ResponseEntity.ok("Login successful!   "+ loggedInJwtToken);
        } else {
            // Return an error response
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials!");
        }
    }

    @PostMapping("/authorize")
    public ResponseEntity<String> authorize(@RequestBody String jwtToken) {
        // Check if the provided JWT token matches the stored token
        if (loggedInJwtToken != null && loggedInJwtToken.equals(jwtToken)) {
            return ResponseEntity.ok("Authorization successful!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token!");
        }
    }

}
