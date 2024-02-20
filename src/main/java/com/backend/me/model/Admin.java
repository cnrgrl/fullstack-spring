package com.backend.me.model;
import jakarta.persistence.*;

@Entity
@Table(name = "admin_user")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "lastname", nullable = false, length = 255)
    private String lastname;

    @Column(name = "email", nullable = false, length = 255)
    private String email;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Column(name = "role", nullable = false, length = 20)
    private String role;

    @Column(name = "authorization", nullable = false, length = 255)
    private String authorization;

    // getters and setters
}
