package com.ajay.coursemanagementspring.controller;

import com.ajay.coursemanagementspring.dto.CourseDetailsDTO;
import com.ajay.coursemanagementspring.model.Course;
import com.ajay.coursemanagementspring.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    // Retrieve all courses
    @GetMapping
    public List<Course> getAllCourses() {
        System.out.println(courseService.getAllCourses());
        return courseService.getAllCourses();
    }

    // Retrieve course by ID
    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    // Retrieve detailed course information
    @GetMapping("/details/{id}")
    public CourseDetailsDTO getCourseDetails(@PathVariable Long id) {
        Course course = courseService.getCourseById(id);

        if (course == null) {
            throw new RuntimeException("Course not found with ID: " + id);
        }

        CourseDetailsDTO dto = new CourseDetailsDTO();
        dto.setCourses(List.of(course)); // Wrap the course in a list
        dto.setInstructors(course.getInstructors());
        dto.setCourseMaterials(course.getCourseMaterials());
        dto.setSchedules(course.getSchedules());
        dto.setEnrolledStudents(course.getEnrolledStudents());

        return dto;
    }

    // Create a new course
    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }

    // Delete a course by ID
    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }
}
