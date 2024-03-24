package com.lokes.weatherapp.rest;

import com.lokes.weatherapp.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;

    // @PostConstruct is only called when the bean is created
    @PostConstruct
    public void loadData() {
        // above we have only initialized the list but haven't created
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Lokesh", "Naik"));
        theStudents.add(new Student("Eeshwar", "y"));
        theStudents.add(new Student("Vamsi", "B"));
    }
    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }
}
