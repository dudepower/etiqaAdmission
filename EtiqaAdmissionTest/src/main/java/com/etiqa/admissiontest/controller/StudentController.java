package com.etiqa.admissiontest.controller;

import com.etiqa.admissiontest.model.Student;
import com.etiqa.admissiontest.service.IStudentServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("course")
public class StudentController {

    @Autowired
    private IStudentServices studentServices;

    @GetMapping("/studentsByCourseId")
    public List<Student> getStudentsByCourseId(@RequestParam(value = "courseId") String courseId) {
        return studentServices.getStudentsByCourseId(courseId);
    }

}
