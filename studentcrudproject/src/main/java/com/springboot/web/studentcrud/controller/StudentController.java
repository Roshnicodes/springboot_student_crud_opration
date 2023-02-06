package com.springboot.web.studentcrud.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.studentcrud.entity.Student;
import com.springboot.web.studentcrud.repository.StudentRepository;


@RestController
public class StudentController {
	@Autowired
	StudentRepository studentRepository;
	@PostMapping("/studentSave")
public String insertStudent(@RequestBody Student student) {
		studentRepository.save(student);
		return "your record is saved succesfully";
	}
	@PostMapping("/multipleStudentSave")
	public String insertStudent(@RequestBody List<Student> student) {
			studentRepository.saveAll(student);
			return " Record is saved succesfully";
}
	@GetMapping("/getAllStudent")
	 public List<Student> getStudent(){
		return(List<Student>)studentRepository.findAll();
	}
	@GetMapping("/getByStudentName/{stuName}")
	 public List<Student>  getStudentByName(@PathVariable("stuName")String stuName){
		return(List<Student>)studentRepository.findBystuName(stuName);
	}
	@GetMapping("/getByStudentId/{stuid}")
	public List<Student>  getStudentById(@PathVariable("stuid")int stuid){
		return(List<Student>)studentRepository.findBystuid(stuid);
	}
	@DeleteMapping("/deleteByStudentId/{stuid}")
	public void deleteStudent(@PathVariable("stuid") int stuid) {
		System.out.println("deleted");
		studentRepository.deleteById(stuid);
	}
	
	  @PutMapping("/updateStudent/{stuid}") public String
	  updateStudentById(@PathVariable Integer stuid, @RequestBody Student student)
	  { Optional<Student> stu = studentRepository.findById(stuid);
	  if(stu.isPresent()) { Student existstu = stu.get();
	  existstu.setStuid(student.getStuid());
	  existstu.setStuRollNo(student.getStuRollNo());
	  existstu.setStuName(student.getStuName());
	  existstu.setStuCity(student.getStuCity()); studentRepository.save(existstu);
	  
	  return "Student Details against stuid " + stuid + "updated"; } else { return
	  "student details does not exist fom stuid " + stuid ; }
	  
	  }
	 
	}
	

