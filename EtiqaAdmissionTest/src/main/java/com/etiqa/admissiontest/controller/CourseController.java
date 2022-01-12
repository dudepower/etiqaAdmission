package com.etiqa.admissiontest.controller;

import com.etiqa.admissiontest.model.Course;
import com.etiqa.admissiontest.service.ICourseServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("course")
public class CourseController {

    @Autowired
    private ICourseServices courseServices;

    @PutMapping("/saveCourse")
    public void saveStudentCourse(@RequestBody Course course) {
        log.info("Received course for saving:{}", course);
        courseServices.saveCourse(course);
    }

    @GetMapping("/getAllCourses")
    public List<Course> getAllCourses() {
        return courseServices.getAllCourses();
    }

    @GetMapping("/getCourseDetail")
    public Course getCourseDetail(@RequestParam(value = "courseId") String courseId) {
        return courseServices.getCourseDetail(courseId);
    }

    @PostMapping("/updateCourse")
    public void updateStudentCourse(@RequestBody Course course) {
        log.info("Course to be updated:{}", course);
        courseServices.updateCourse(course);
    }

    @DeleteMapping("/deleteCourse")
    public void deleteStudentCourse(@RequestParam(value = "courseId") long courseId) {
        log.info("Course Id to be deleted:{}", courseId);
        courseServices.deleteCourse(courseId);
    }
}
