package com.codegym.demospringboot.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
@Table
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String avatar;

    @Transient
    private MultipartFile image;

    public Student() {
    }

    public Student(String name, MultipartFile multipartFile) {
        this.name = name;
        this.image = multipartFile;
    }

    public Student(String name, String avatar) {
        this.name = name;
        this.avatar = avatar;
    }

    @ManyToOne
    private Classes classes;
}
