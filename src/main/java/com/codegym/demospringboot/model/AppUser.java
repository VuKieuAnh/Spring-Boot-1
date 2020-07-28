package com.codegym.demospringboot.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String password;

    @ManyToOne
    private AppRole role;
}
