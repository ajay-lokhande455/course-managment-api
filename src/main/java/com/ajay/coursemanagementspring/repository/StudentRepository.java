package com.ajay.coursemanagementspring.repository;

import com.ajay.coursemanagementspring.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
