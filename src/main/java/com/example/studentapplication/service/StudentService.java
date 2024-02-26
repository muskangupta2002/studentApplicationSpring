package com.example.studentapplication.service;

import com.example.studentapplication.model.Student;
import java.util.List;

public interface StudentService {
    Long addStudent(Student student);
    List<Student> getAllStudentsByUniversity(String university);
    Student getStudentById(Long id);
}
