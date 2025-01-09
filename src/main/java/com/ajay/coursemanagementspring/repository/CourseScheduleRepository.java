package com.ajay.coursemanagementspring.repository;

import com.ajay.coursemanagementspring.model.CourseSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseScheduleRepository extends JpaRepository<CourseSchedule, Long> {
}
