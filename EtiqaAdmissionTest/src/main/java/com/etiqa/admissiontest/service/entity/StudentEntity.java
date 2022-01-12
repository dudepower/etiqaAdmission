package com.etiqa.admissiontest.service.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    private String firstName;

    private String lastName;

    @ManyToMany(mappedBy = "students", fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Set<CourseEntity> courses;
}
