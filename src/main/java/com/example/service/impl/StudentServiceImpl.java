package com.example.service.impl;

import com.example.dto.StudentDto;
import com.example.entity.Student;
import com.example.mapper.StudentMapper;
import com.example.repository.StudentRepo;
import com.example.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public StudentDto createStudent(StudentDto studentDto) {
        Student student = StudentMapper.mapToStudent(studentDto);
        Student createdStudent = studentRepo.save(student);
        return StudentMapper.mapToStudentDto(createdStudent);
    }
}
