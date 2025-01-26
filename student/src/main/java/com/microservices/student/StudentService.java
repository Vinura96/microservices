package com.microservices.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    private final StudentRepository repository;
    public void saveStudent(Student student) {
        repository.save(student);
    }
    public List<Student> findAllStudents() {
        return repository.findAll();
    }
}
