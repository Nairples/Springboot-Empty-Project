package com.nairples.apigen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nairples.apigen.model.ApiGenReq;
import com.nairples.apigen.model.ClassDefinition;
import com.nairples.apigen.service.GeneratorClassService;


@RestController
@RequestMapping("/api")
public class GeneratorController {
	
	@Autowired
	private GeneratorClassService generatorClassService;
	
	@PostMapping("/generate")
	public ResponseEntity<String> generator(@RequestBody ApiGenReq request) {
		return new ResponseEntity<>("", HttpStatus.CREATED);
	}
	
	
	@PostMapping("/generate/class")
	public ResponseEntity<String> generatorClass(@RequestBody ClassDefinition request) {
		
		generatorClassService.generateClass(request);
		return new ResponseEntity<>("", HttpStatus.CREATED);
	}
	

}
