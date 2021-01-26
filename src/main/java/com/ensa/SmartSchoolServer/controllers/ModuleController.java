package com.ensa.SmartSchoolServer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.SmartSchoolServer.entity.Module;
import com.ensa.SmartSchoolServer.service.ModuleService;

@RestController
@RequestMapping(value="/module",method= {RequestMethod.POST,RequestMethod.PUT,RequestMethod.GET,RequestMethod.DELETE})
public class ModuleController {
	
	@Autowired
	private ModuleService moduleService;
	
	@RequestMapping(value = "/create",method=RequestMethod.POST)
	@ResponseBody
	public Module create(@RequestBody Module module) {
		return moduleService.create(module);
	}
	
	@RequestMapping(value = "/update/moduleName={moduleName}",method=RequestMethod.PUT)
	public boolean updateModuleName(@RequestBody Module module, @PathVariable(name="moduleName") String name) {
		return moduleService.updateModuleName(module, name);
	}
	
	@RequestMapping(value = "/delete",method=RequestMethod.DELETE)
	public boolean delete(@RequestBody Module module) {
		return moduleService.delete(module);
	}
	
	@RequestMapping(value = "/getModules",method=RequestMethod.GET)
	public List<Module> getModules() {
		return moduleService.getModules();
	}
	
	@RequestMapping(value = "/getModule",method=RequestMethod.GET)
        //<=> GetMapping(value = "/getModule");
	//@ResponseBody
	public Module getModule(String name) {
		return moduleService.getModule(name);
	}

}
