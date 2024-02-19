package com.backend.me.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

// Example for BlogPost.java
@Entity
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private String imgUrl;

    private LocalDateTime date;

    private int likes;

    private int comments;

    private boolean isVisible;

    // getters and setters
}
