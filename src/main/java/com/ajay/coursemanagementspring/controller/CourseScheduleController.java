package com.ajay.coursemanagementspring.controller;

import com.ajay.coursemanagementspring.model.CourseSchedule;
import com.ajay.coursemanagementspring.service.CourseScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course-schedules")
public class CourseScheduleController {

    @Autowired
    private CourseScheduleService courseScheduleService;

    // Get all course schedules
    @GetMapping
    public List<CourseSchedule> getAllCourseSchedules() {
        return courseScheduleService.getAllCourseSchedules();
    }

    // Get course schedule by ID
    @GetMapping("/{id}")
    public CourseSchedule getCourseScheduleById(@PathVariable Long id) {
        return courseScheduleService.getCourseScheduleById(id);
    }

    // Create a new course schedule
    @PostMapping
    public CourseSchedule createCourseSchedule(@RequestBody CourseSchedule courseSchedule) {
        return courseScheduleService.saveCourseSchedule(courseSchedule);
    }

    // Update an existing course schedule
    @PutMapping("/{id}")
    public CourseSchedule updateCourseSchedule(@PathVariable Long id, @RequestBody CourseSchedule courseSchedule) {
        courseSchedule.setId(id);
        return courseScheduleService.saveCourseSchedule(courseSchedule);
    }

    // Delete a course schedule
    @DeleteMapping("/{id}")
    public void deleteCourseSchedule(@PathVariable Long id) {
        courseScheduleService.deleteCourseSchedule(id);
    }
}
