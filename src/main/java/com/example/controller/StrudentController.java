package com.example.controller;

import com.example.dto.StudentDto;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/createStudent")
    public ResponseEntity<StudentDto> createStudents(@RequestBody StudentDto studentDto){
        return null;
    }


}
