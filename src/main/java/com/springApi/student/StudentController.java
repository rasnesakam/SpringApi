package com.springApi.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/students")
public class StudentController {

    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAll(){
        return service.getAll();
    }

    @PostMapping
    public void register(@RequestBody Student student){
        service.addNew(student);
    }

    @PutMapping(path = "{StudentId}")
    public void update(@PathVariable("studentId") String studentId,@RequestBody Student student){
            UUID id;
            try {
                id = UUID.fromString(studentId);
            }catch (IllegalArgumentException e){
                throw new IllegalArgumentException("Invalid id",e);
            }
            service.update(id,student);
    }

    @DeleteMapping(path = "{studentId}")
    public void delete(@PathVariable("studentId") String studentId){
        UUID id;
        try{
            id = UUID.fromString(studentId);

        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Invalid id",e);
        }
        service.delete(id);
    }
}
