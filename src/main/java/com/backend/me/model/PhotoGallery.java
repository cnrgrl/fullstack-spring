package com.backend.me.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class PhotoGallery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    private String imgUrl;
    private LocalDateTime date;
    private int likes;
    @Column(columnDefinition = "TEXT")
    private String comments;
    private boolean isVisible;

    // getters and setters
}