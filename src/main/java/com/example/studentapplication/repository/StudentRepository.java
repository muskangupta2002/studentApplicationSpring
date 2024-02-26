package com.example.studentapplication.repository;

import com.example.studentapplication.model.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    public Long addStudent(Student student) {
        // generate id and add student to the list
        return student.getId();
    }

    public List<Student> getAllStudentsByUniversity(String university) {
        //filter students by university
        return students;
    }

    public Student getStudentById(Long id) {
        // find student by id
        return null;
    }
}

