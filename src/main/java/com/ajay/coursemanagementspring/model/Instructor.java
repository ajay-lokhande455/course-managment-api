package com.ajay.coursemanagementspring.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String expertise;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @JsonBackReference
    private Course course;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getExpertise() {
        return expertise;
    }

    public Course getCourse() {
        return course;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
