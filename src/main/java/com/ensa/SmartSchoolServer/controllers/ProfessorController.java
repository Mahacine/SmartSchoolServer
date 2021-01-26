package com.ensa.SmartSchoolServer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.SmartSchoolServer.entity.Professor;
import com.ensa.SmartSchoolServer.service.ProfessorService;



@RestController
@RequestMapping(value="/professor",method= {RequestMethod.POST,RequestMethod.PUT,RequestMethod.GET,RequestMethod.DELETE})
public class ProfessorController {
	
	@Autowired
	private ProfessorService professorService;
	
	@RequestMapping(value = "/getProfessors",method=RequestMethod.GET)
	public List<Professor> getProfessors() {
		return professorService.getProfessors();
	}
	
	@RequestMapping(value = "/getProfessor",method=RequestMethod.POST)
	public Professor getProfessor(String firstName,String lastName) {
		return professorService.getProfessor(firstName, lastName);
	}
	
	@RequestMapping(value = "/updateProfessorFirstName",method=RequestMethod.PUT)
	public boolean updateProfessorFirstName(Professor professor,String firstName) {
		return professorService.updateProfessorFirstName(professor, firstName);
	}
	
	@RequestMapping(value = "/updateProfessorLastName",method=RequestMethod.PUT)
	public boolean updateProfessorLastName(Professor professor,String lastName) {
		return professorService.updateProfessorLastName(professor, lastName);
	}
	
	@RequestMapping(value = "/delete",method=RequestMethod.DELETE)
	public boolean delete(Professor professor) {
		return professorService.delete(professor);
	}
	
	@RequestMapping(value = "/create",method=RequestMethod.POST)
	public boolean create(Professor professor) {
		return professorService.create(professor);
	}
	
}
