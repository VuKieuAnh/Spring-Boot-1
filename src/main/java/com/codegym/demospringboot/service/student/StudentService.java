package com.codegym.demospringboot.service.student;

import com.codegym.demospringboot.model.Student;
import com.codegym.demospringboot.repository.IStudtentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudtentRepository studtentRepository;

    @Override
    public Iterable<Student> findAll() {
        return studtentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Student save(Student student) {
        return studtentRepository.save(student);
    }

    @Override
    public void remove(Long id) {

    }
}
