package com.example.studentapplication.service;

import com.example.studentapplication.model.Student;
import com.example.studentapplication.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Long addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    @Override
    public List<Student> getAllStudentsByUniversity(String university) {
        return studentRepository.getAllStudentsByUniversity(university);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.getStudentById(id);
    }
}
