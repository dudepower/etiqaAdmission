package com.etiqa.admissiontest.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {

    private String studentId;
    private String firstName;
    private String lastName;
}
