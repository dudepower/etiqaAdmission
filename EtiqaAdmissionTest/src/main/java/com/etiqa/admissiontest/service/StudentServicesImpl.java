package com.etiqa.admissiontest.service;

import com.etiqa.admissiontest.model.Course;
import com.etiqa.admissiontest.model.Student;
import com.etiqa.admissiontest.service.dao.CourseRepository;
import com.etiqa.admissiontest.service.dao.StudentRepository;
import com.etiqa.admissiontest.service.entity.CourseEntity;
import com.etiqa.admissiontest.service.entity.StudentEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class StudentServicesImpl implements IStudentServices {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudentsByCourseId(String courseId) {
        return studentRepository.getStudentsByCourseId(courseId);
    }
}
