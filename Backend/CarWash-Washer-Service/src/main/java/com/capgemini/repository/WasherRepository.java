package com.capgemini.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.entity.Washer;

public interface WasherRepository extends MongoRepository<Washer, Integer> {

	Washer findByEmail(String email);
}