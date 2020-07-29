package com.codegym.demospringboot.service.student;

import com.codegym.demospringboot.model.Student;
import com.codegym.demospringboot.repository.IStudtentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

import static org.assertj.core.api.Assertions.assertThat;

class StudentServiceTest {

    private IStudtentRepository studtentRepository = Mockito.mock(IStudtentRepository.class);
    private IStudentService studentService = new StudentService(studtentRepository);

    @BeforeEach
    void init(){
        Student student = new Student();
        student.setName("Phu 3D");
        student.setAvatar("phu.png");
        List<Student> studentList = Arrays.asList(student);
        doReturn(studentList).when(studtentRepository).findAll();
    }

    @Test
    @DisplayName("findAll can return list is not null")
    public void whenFindAllNotNull(){
        assertThat(studentService.findAll()).hasSize(1);
    }



}