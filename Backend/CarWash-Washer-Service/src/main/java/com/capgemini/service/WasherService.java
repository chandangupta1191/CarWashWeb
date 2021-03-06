package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entity.Washer;
import com.capgemini.repository.WasherRepository;

@Service
public class WasherService {
	
	@Autowired
	private WasherRepository repository;
	
	public List<Washer> getAllWasher(){
		return repository.findAll();
	}

}
