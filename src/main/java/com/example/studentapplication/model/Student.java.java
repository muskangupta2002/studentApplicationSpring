package com.example.studentapplication.model;

import lombok.Data;

@Data
public class Student {
    private Long id;
    private String name;
    private int age;
    private String adhar;
    private String university;
}
