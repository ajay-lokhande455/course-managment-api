package com.ajay.coursemanagementspring.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class CourseMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String link;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "course_id")
    private Course course;

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getLink() {
        return link;
    }

    public Course getCourse() {
        return course;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
