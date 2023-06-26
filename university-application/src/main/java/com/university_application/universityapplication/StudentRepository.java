package com.university_application.universityapplication;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {



    Student findByEnrollNumber(String enrollNumber);



    Student findByName(String name);



}
