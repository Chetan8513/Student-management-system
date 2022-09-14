/**
 * 
 */
package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Student;
import com.spring.service.StudentService;

import antlr.collections.List;

/**
 * @author Dell
 *
 */
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService; 
	
	@GetMapping("/index")
	public String index() {
		
		return "student management up and running";
	}
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student)
	{
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/getAllStudents")
	public java.util.List<Student>getAllStudents()
	{
		return  studentService.getStudentList();
	}
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable int id) {
		
		studentService.deleteStudent(id);
		
	}

}
