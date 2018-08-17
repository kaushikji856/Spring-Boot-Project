package io.vipin.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.vipin.model.ClassInfo;
import io.vipin.service.ClassService;

/**
 * @author VI852115
 *
 */

@RestController
public class ClassController {

	@Autowired
	ClassService classService;
	
	@RequestMapping("/getclass")
	public java.util.List<ClassInfo> getClasses() {
		return classService.getAllClass();
	}
	
	@RequestMapping("/getclass/{id}")
	public ClassInfo getClassById(@PathVariable String id) {
		return classService.getClassById(id);
	}
}
