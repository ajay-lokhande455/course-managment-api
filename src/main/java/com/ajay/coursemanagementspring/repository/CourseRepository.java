package com.ajay.coursemanagementspring.repository;

import com.ajay.coursemanagementspring.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
