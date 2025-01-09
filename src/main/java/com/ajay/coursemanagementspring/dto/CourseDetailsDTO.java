package com.ajay.coursemanagementspring.dto;

import com.ajay.coursemanagementspring.model.*;

import java.util.List;

public class CourseDetailsDTO {

    private List<Course> courses;
    private List<Instructor> instructors;
    private List<CourseMaterial> courseMaterials;
    private List<CourseSchedule> schedules;
    private List<Student> enrolledStudents;

    public List<Course> getCourses() {
        return courses;
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

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }

    public void setCourseMaterials(List<CourseMaterial> courseMaterials) {
        this.courseMaterials = courseMaterials;
    }

    public void setSchedules(List<CourseSchedule> schedules) {
        this.schedules = schedules;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
