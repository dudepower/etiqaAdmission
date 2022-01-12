package com.etiqa.admissiontest.service;

import com.etiqa.admissiontest.model.Course;
import com.etiqa.admissiontest.model.Student;
import com.etiqa.admissiontest.service.dao.CourseRepository;
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
public class CourseServicesImpl implements ICourseServices {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public void saveCourse(Course course) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new PropertyMap<Student, StudentEntity>() {
            protected void configure() {
                map().setFirstName(source.getFirstName());
                map().setLastName(source.getLastName());
            }
        });
        var entity = modelMapper.map(course, CourseEntity.class);
        courseRepository.save(entity);
    }

    @Override
    public List<Course> getAllCourses() {
        ModelMapper modelMapper = new ModelMapper();
        return StreamSupport.stream(courseRepository.findAll().spliterator(), false)
                .map(courseEntity -> modelMapper.map(courseEntity, Course.class))
                .collect(Collectors.toList());
    }

    @Override
    public Course getCourseDetail(String courseId) {
        return null;
    }

    @Override
    public void updateCourse(Course course) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new PropertyMap<Student, StudentEntity>() {
            protected void configure() {
                map().setFirstName(source.getFirstName());
                map().setLastName(source.getLastName());
            }
        });
        courseRepository.save(modelMapper.map(course, CourseEntity.class));
    }

    @Override
    public void deleteCourse(long courseId) {
        courseRepository.deleteById(courseId);
    }
}
