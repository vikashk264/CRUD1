package com.example.repository;

import com.example.entity.Student;
import org.hibernate.query.criteria.JpaFetchParent;

public interface StudentRepo extends JpaFetchParent<Student,Long> {
}
