package com.lokes.weatherapp.rest;

import com.lokes.weatherapp.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("Lokesh", "Naik"));
        theStudents.add(new Student("Eeshwar", "y"));
        theStudents.add(new Student("Vamsi", "B"));
        return theStudents;
    }

}
