package com.capgemini.carwash.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.carwash.entity.AddOn;

public interface AddOnService {

	List<AddOn> getAllAddOnList();
	
	Optional<AddOn> getByAddOnid(Integer addonid);
	
	AddOn saveAddOnDetails(AddOn addon);
	
	void deleteByAddOnid(Integer addonid);
}
