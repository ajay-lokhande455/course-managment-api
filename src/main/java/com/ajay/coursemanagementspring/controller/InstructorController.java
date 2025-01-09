package com.ajay.coursemanagementspring.controller;

import com.ajay.coursemanagementspring.model.Instructor;
import com.ajay.coursemanagementspring.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    // Get all instructors
    @GetMapping
    public List<Instructor> getAllInstructors() {
        return instructorService.getAllInstructors();
    }

    // Get instructor by ID
    @GetMapping("/{id}")
    public Instructor getInstructorById(@PathVariable Long id) {
        return instructorService.getInstructorById(id);
    }

    // Create a new instructor
    @PostMapping
    public Instructor createInstructor(@RequestBody Instructor instructor) {
        return instructorService.saveInstructor(instructor);
    }

    // Update an existing instructor
    @PutMapping("/{id}")
    public Instructor updateInstructor(@PathVariable Long id, @RequestBody Instructor instructor) {
        instructor.setId(id);
        return instructorService.saveInstructor(instructor);
    }

    // Delete an instructor
    @DeleteMapping("/{id}")
    public void deleteInstructor(@PathVariable Long id) {
        instructorService.deleteInstructor(id);
    }
}
