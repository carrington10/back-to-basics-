package com.springtut.springtutorial.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springtut.springtutorial.model.Course;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCources(){
        return Arrays.asList( new Course(1, "learn aws", "spring"),
        new Course(2,"learn java", "java"));
    }// enf of function
        
}// end of course controller 
