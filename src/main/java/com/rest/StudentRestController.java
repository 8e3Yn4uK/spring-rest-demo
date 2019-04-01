package com.rest;

import com.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 8e3Yn4uK on 01.04.2019
 */

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Will", "Smith"));
        list.add(new Student("Bruce", "Willith"));

        return list;
    }
}
