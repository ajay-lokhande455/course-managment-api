package com.ajay.coursemanagementspring.service;

import com.ajay.coursemanagementspring.model.CourseSchedule;
import com.ajay.coursemanagementspring.repository.CourseScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseScheduleService {

    @Autowired
    private CourseScheduleRepository courseScheduleRepository;

    public List<CourseSchedule> getAllCourseSchedules() {
        return courseScheduleRepository.findAll();
    }

    public CourseSchedule getCourseScheduleById(Long id) {
        return courseScheduleRepository.findById(id).orElse(null);
    }

    public CourseSchedule saveCourseSchedule(CourseSchedule courseSchedule) {
        return courseScheduleRepository.save(courseSchedule);
    }

    public void deleteCourseSchedule(Long id) {
        courseScheduleRepository.deleteById(id);
    }
}
