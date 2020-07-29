package com.codegym.demospringboot.repository;

import com.codegym.demospringboot.model.Classes;
import com.codegym.demospringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IClassesRepository extends JpaRepository<Classes, Long> {

}
