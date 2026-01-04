package com.vishal.projects.lovable_clone.controller;


import com.vishal.projects.lovable_clone.dto.auth.AuthResponse;
import com.vishal.projects.lovable_clone.dto.auth.LoginRequest;
import com.vishal.projects.lovable_clone.dto.auth.SignupRequest;
import com.vishal.projects.lovable_clone.dto.auth.UserProfileResponse;
import com.vishal.projects.lovable_clone.entity.User;
import com.vishal.projects.lovable_clone.service.AuthService;
import com.vishal.projects.lovable_clone.service.UserService;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequestMapping("/api/auth")
public class AuthController {

    AuthService authService;
    UserService userService;


    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(@RequestBody SignupRequest request){
        return ResponseEntity.ok(authService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile(){
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));


    }

}
