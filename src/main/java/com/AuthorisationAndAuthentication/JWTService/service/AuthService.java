package com.AuthorisationAndAuthentication.JWTService.service;

import com.AuthorisationAndAuthentication.JWTService.dto.request.LoginRequest;
import com.AuthorisationAndAuthentication.JWTService.dto.request.SignUpRequest;
import com.AuthorisationAndAuthentication.JWTService.dto.request.TokenRefreshRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {

    public ResponseEntity<?> authSignInRequest(LoginRequest loginRequest);

    public ResponseEntity<?> authSignUpRequest(SignUpRequest signUpRequest);

    ResponseEntity<?> getRefreshToken(TokenRefreshRequest request);

    ResponseEntity<?> signOutUser();

}
