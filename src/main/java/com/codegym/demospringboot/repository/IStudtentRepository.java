package com.codegym.demospringboot.repository;

import com.codegym.demospringboot.model.Classes;
import com.codegym.demospringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Iterator;

public interface IStudtentRepository extends JpaRepository<Student, Long> {
    Iterator<Student> findAllByClasses(Classes c);
}
