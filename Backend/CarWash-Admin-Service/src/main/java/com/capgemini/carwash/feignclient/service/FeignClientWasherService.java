package com.capgemini.carwash.feignclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "CarWash-Washer", url = "http://localhost:8082/api")
public interface FeignClientWasherService {
	
	@GetMapping("/washer/washerList")
	public ResponseEntity<?> getAllWasher();
}
