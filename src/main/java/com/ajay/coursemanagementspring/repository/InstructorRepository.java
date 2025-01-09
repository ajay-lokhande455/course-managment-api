package com.ajay.coursemanagementspring.repository;

import com.ajay.coursemanagementspring.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
