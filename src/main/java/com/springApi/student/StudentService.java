package com.springApi.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {

    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAll(){
        return repository.findAll();
    }

    public void addNew(Student student){

        Optional<Student> optionalStudent = repository.findStudentByEmail(student.getMail());
        if (optionalStudent.isPresent())
            throw new IllegalStateException("email taken");
        repository.save(student);

    }

    public void update(UUID id, Student student){

    }
    public void delete(UUID studentId){
        Optional<Student> optionalStudent = repository.findById(studentId);
        optionalStudent.ifPresentOrElse(repository::delete,()-> { throw new IllegalArgumentException("Student doesn't exists"); });
    }
}
