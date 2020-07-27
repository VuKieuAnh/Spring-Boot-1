package com.codegym.demospringboot.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
