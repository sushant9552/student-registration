package com.ssj.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssj.studentmanagement.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
