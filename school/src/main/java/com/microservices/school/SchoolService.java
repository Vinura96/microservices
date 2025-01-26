package com.microservices.school;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    public SchoolService(SchoolRepository repository) {
        this.repository = repository;
    }

    private final SchoolRepository repository;
    public void saveSchool(School school) {
        repository.save(school);
    }
    public List<School> findAllSchools() {
        return repository.findAll();
    }
}
