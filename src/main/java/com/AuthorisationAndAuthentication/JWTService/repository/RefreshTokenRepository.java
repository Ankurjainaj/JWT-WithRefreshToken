package com.AuthorisationAndAuthentication.JWTService.repository;

import com.AuthorisationAndAuthentication.JWTService.model.RefreshToken;
import com.AuthorisationAndAuthentication.JWTService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String token);

    @Modifying
    int deleteByUser(User user);
}