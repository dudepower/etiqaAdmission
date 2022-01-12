package com.etiqa.admissiontest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Course {
    @JsonIgnore
    private long id;
    private String moduleName;
    private List<Student> students;
}
