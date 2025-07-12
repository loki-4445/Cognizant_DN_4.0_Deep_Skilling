package com.example.jwtauth.controller;

import com.example.jwt_auth.service.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public String authenticate(HttpServletRequest request) {
        System.out.println(">>> /authenticate endpoint called");

        String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return "Missing Authorization Header";
        }

        String base64Credentials = authHeader.substring("Basic ".length());
        byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(credDecoded);
        String[] values = credentials.split(":", 2);

        String username = values[0];
        String password = values[1];

        if ("user".equals(username) && "pwd".equals(password)) {
            String token = jwtUtil.generateToken(username);
            return "{\"token\":\"" + token + "\"}";
        } else {
            return "Invalid credentials";
        }
    }
}
