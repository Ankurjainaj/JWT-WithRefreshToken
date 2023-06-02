package com.AuthorisationAndAuthentication.JWTService.controller;

import com.AuthorisationAndAuthentication.JWTService.dto.request.LoginRequest;
import com.AuthorisationAndAuthentication.JWTService.dto.request.SignUpRequest;
import com.AuthorisationAndAuthentication.JWTService.dto.request.TokenRefreshRequest;
import com.AuthorisationAndAuthentication.JWTService.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Validated
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;


    @PostMapping("/sign_in")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        ResponseEntity<?> responseEntity = authService.authSignInRequest(loginRequest);
        return responseEntity;
    }

    @PostMapping("/sign_up")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
        ResponseEntity<?> responseEntity = authService.authSignUpRequest(signUpRequest);
        return responseEntity;
    }

    @PostMapping("/refresh_token")
    public ResponseEntity<?> refreshtoken(@Valid @RequestBody TokenRefreshRequest request) {
        ResponseEntity<?> responseEntity = authService.getRefreshToken(request);
        return responseEntity;
    }

    @PostMapping("/sign_out")
    public ResponseEntity<?> logoutUser() {
        ResponseEntity<?> responseEntity = authService.signOutUser();
        return responseEntity;
    }
}