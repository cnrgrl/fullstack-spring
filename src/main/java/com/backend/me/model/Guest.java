package com.backend.me.model;
import jakarta.persistence.*;

@Entity
@Table(name = "guest")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "page_visit_count", columnDefinition = "INT DEFAULT 0")
    private int pageVisitCount;

}
