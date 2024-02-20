package com.backend.me.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "contact_form")
@Getter
@Setter
public class ContactForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String message;
    private String email;
    private String user_type; //'admin', 'follower', 'guest'
    private LocalDateTime date;
    private int comments;

    // getters and setters
}
