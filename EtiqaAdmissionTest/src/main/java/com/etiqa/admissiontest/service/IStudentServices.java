package com.etiqa.admissiontest.service;

import com.etiqa.admissiontest.model.Student;

import java.util.List;

public interface IStudentServices {

    List<Student> getStudentsByCourseId(String courseId);
}
