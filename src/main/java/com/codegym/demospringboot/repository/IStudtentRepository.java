package com.codegym.demospringboot.repository;

import com.codegym.demospringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudtentRepository extends JpaRepository<Student, Long> {
}
