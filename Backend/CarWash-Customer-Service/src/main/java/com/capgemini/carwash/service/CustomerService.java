package com.capgemini.carwash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.carwash.entity.Customer;
import com.capgemini.carwash.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;
	
	public List<Customer> getAllCustomers(){
		return repository.findAll();
	}
}
