package com.example.mapper;

import com.example.dto.StudentDto;
import com.example.entity.Student;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student)
    {
        return new StudentDto(student.getId(),student.getStsName(),student.getStsEmail(),student.getStdPass());
    }


    public static Student mapToStudent(StudentDto studentDto)
    {
        return new Student(studentDto.getId(),studentDto.getStsName(),studentDto.getStsEmail(),studentDto.getStdPass());
    }
}
