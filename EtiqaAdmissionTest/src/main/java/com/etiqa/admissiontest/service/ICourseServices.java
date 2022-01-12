package com.etiqa.admissiontest.service;

import com.etiqa.admissiontest.model.Course;

import java.util.List;

public interface ICourseServices {

    void saveCourse(Course course);

    List<Course> getAllCourses();

    Course getCourseDetail(String moduleId);

    void updateCourse(Course course);

    void deleteCourse(long moduleId);
}
