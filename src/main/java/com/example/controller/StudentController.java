package com.example.controller;

import com.example.dto.StudentDto;
import com.example.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private IStudentService iStudentService;

    @PostMapping(value = "/create")
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto){
        StudentDto createdStudent = iStudentService.createStudent(studentDto);
        return  new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }
}
