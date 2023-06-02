package com.AuthorisationAndAuthentication.JWTService.repository;

import com.AuthorisationAndAuthentication.JWTService.model.ERole;
import com.AuthorisationAndAuthentication.JWTService.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}