package com.vihar.OCD.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "Login Successful ✅";
    }
}
