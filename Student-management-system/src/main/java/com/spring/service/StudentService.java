/**
 * 
 */
package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Repo.StudentRepo;
import com.spring.entity.Student;

/**
 * @author Dell
 *
 */
@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	public Student saveStudent(Student student)
	
	{
		return studentRepo.save(student);
	}

	public List<Student> getStudentList() {
		
		return studentRepo.findAll() ;
	}
public void deleteStudent(int id ) {
	 studentRepo.deleteById(1);
	
}
}
