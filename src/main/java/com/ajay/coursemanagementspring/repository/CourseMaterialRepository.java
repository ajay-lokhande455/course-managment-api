package com.ajay.coursemanagementspring.repository;

import com.ajay.coursemanagementspring.model.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long> {
}
