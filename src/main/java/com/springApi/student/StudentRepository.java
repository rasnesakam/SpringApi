package com.springApi.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {

    @Query("SELECT s FROM Student s WHERE s.mail = ?1")
    Optional<Student> findStudentByEmail(String email);
}
