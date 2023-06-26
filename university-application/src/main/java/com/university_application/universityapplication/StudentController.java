package com.university_application.universityapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/students/{enrollNumber}")
    public Student getStudentByEnrollNumber(@PathVariable String enrollNumber) {
        return studentRepository.findByEnrollNumber(enrollNumber);
    }



    @GetMapping("/students/{name}")
    public Student getStudentByName(@PathVariable String name) {
        return studentRepository.findByName(name);
    }



}

