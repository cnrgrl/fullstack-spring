package com.backend.me.model;
import jakarta.persistence.*;

@Entity
@Table(name = "follower")
public class Follower {

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

    @Column(name = "comments", columnDefinition = "INT DEFAULT 0")
    private int comments;

    @Column(name = "likes", columnDefinition = "INT DEFAULT 0")
    private int likes;

    @Column(name = "page_visit_count", columnDefinition = "INT DEFAULT 0")
    private int pageVisitCount;
}
