package com.ensa.SmartSchoolServer.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.SmartSchoolServer.service.StudentService;
import com.ensa.SmartSchoolServer.entity.Student;

@RestController
@RequestMapping(value="/student",method= {RequestMethod.POST,RequestMethod.PUT,RequestMethod.GET,RequestMethod.DELETE})
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/create",method=RequestMethod.POST)
	public boolean create(Student student) {
		return studentService.create(student);
	}
	
	@RequestMapping(value = "/updatePassword",method=RequestMethod.PUT)
	public boolean updateStudentPassword(Student student, String password) {
		return studentService.updatePassword(student, password);
	}
	
	@RequestMapping(value = "/delete",method=RequestMethod.DELETE)
	public boolean delete(Student student) {
		return studentService.delete(student);
	}
	
	@RequestMapping(value = "/getStudents",method=RequestMethod.GET)
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
	
	@RequestMapping(value = "/getStudent",method=RequestMethod.GET)
	public Student getStudents(String firstName,String lastName) {
		return studentService.getStudent(firstName,lastName);
	}
	
	@RequestMapping(value = "/getStudentByEmail",method=RequestMethod.GET)
	public Student getStudentbyemail(String email) {
		return studentService.getStudentByEmail(email);
	}
}
