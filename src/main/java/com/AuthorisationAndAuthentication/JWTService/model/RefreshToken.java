package com.AuthorisationAndAuthentication.JWTService.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Entity(name = "refresh_token")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class RefreshToken {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column(nullable = false, unique = true)
    private String token;

    @Column(nullable = false)
    private Instant expiryDate;

}
