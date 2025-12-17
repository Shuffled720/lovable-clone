package com.vishal.projects.lovable_clone.controller;


import com.vishal.projects.lovable_clone.dto.auth.AuthResponse;
import com.vishal.projects.lovable_clone.dto.auth.SignupRequest;
import com.vishal.projects.lovable_clone.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

//    @Autowired
//    AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<Boolean> signup(SignupRequest request){
        return ResponseEntity.ok(true);
    }

}
