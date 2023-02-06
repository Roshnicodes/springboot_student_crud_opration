package com.springboot.web.studentcrud.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springboot.web.studentcrud.entity.Student;



public interface StudentRepository extends JpaRepository<Student, Integer> {
public List<Student> findBystuName(String stuName );

public List<Student> findBystuid(int stuid);



public void deleteById(int stuid);









 



}

