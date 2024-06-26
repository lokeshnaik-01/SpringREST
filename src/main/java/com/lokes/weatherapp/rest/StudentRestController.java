package com.lokes.weatherapp.rest;

import com.lokes.weatherapp.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        if(studentId>= theStudents.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id is not Found - "+studentId);
        }
        return theStudents.get(studentId);
    }

}
