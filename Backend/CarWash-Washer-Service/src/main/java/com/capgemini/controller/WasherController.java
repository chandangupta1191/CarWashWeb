package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.service.WasherService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class WasherController {

	@Autowired
	private WasherService service;
	
	@GetMapping("/washer/washerList")
	public ResponseEntity<?> getAllWasher(){
		log.info("---fetchging all the Washer details---");
		return ResponseEntity.ok(service.getAllWasher());
	}
}