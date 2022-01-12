package com.etiqa.admissiontest.service.dao;


import com.etiqa.admissiontest.model.Student;
import com.etiqa.admissiontest.service.entity.StudentEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Long> {

    @Query("Select a from StudentEntity a join a.courses b where b.courseId = :courseId")
    List<Student> getStudentsByCourseId(String courseId);
}
