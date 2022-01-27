package com.springApi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.UUID;

/**
 * Student Configuration file
 */
@Configuration
public class StudentConfig {

    /*
    // Adding some datas begining of the application
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student student = new Student(
                    UUID.randomUUID(),
                    "Feride",
                    "Aksoy",
                    "ferideaksoy@gmail.com",
                    "Computer Engineering"
            );

            Student student1 = new Student(
                    UUID.randomUUID(),
                    "Can",
                    "Demir",
                    "demircan@gmail.com",
                    "Computer Engineering"
            );


            Student student2 = new Student(
                    UUID.randomUUID(),
                    "Deniz",
                    "Yıldız",
                    "denizyildizi@gmail.com",
                    "Computer Engineering"
            );

            repository.saveAll(List.of(student,student1,student2));
        };
    }
     */
}
