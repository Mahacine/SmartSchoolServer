package com.ensa.SmartSchoolServer.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.SmartSchoolServer.entity.Level;
import com.ensa.SmartSchoolServer.entity.Module;
import com.ensa.SmartSchoolServer.entity.Professor;
import com.ensa.SmartSchoolServer.service.LevelService;

@RestController
@RequestMapping(value="/level",method= {RequestMethod.POST,RequestMethod.PUT,RequestMethod.GET,RequestMethod.DELETE})
public class LevelController {
	
	@Autowired
	private LevelService levelService;
	
	@RequestMapping(value = "/create",method=RequestMethod.POST)
	@ResponseBody
	public boolean create(@RequestBody Level level) {
		return levelService.create(level);
	}
	
	@RequestMapping(value = "/update",method=RequestMethod.PUT)
	public boolean updateLevelName(Level level, String name) {
		return levelService.updateLevelName(level, name);
	}
	
	@RequestMapping(value = "/delete",method=RequestMethod.DELETE)
	public boolean delete(Level level) {
		return levelService.delete(level);
	}
	
	@RequestMapping(value = "/getLevels",method=RequestMethod.GET)
	public List<Level> getLevels() {
		return levelService.getLevels();
	}
	
	@RequestMapping(value = "/getModules",method=RequestMethod.GET)
	public List<Module> getModules(String levelName) {
		return levelService.getModules(levelName);
	}
	
    @RequestMapping(value = "/getProfessors",method=RequestMethod.GET)
	public List<Professor> getProfessors(String levelName) {
		return levelService.getProfessors(levelName);
	}
	
}
