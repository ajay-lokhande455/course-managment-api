package com.ajay.coursemanagementspring.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double duration;

    private String category;
    private String level;


    @OneToMany(mappedBy = "course",
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Instructor> instructors;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<CourseMaterial> courseMaterials;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<CourseSchedule> schedules;

    @ManyToMany(mappedBy = "courses", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Student> enrolledStudents;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getDuration() {
        return duration;
    }

    public String getCategory() {
        return category;
    }

    public String getLevel() {
        return level;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public List<CourseMaterial> getCourseMaterials() {
        return courseMaterials;
    }

    public List<CourseSchedule> getSchedules() {
        return schedules;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
