package com.capgemini.carwash.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.carwash.entity.CarDetails;


public interface CarService {

	 List<CarDetails> getAllCars();
	 
	 Optional<CarDetails> getCarById(Integer carid);
	 
	 Optional<CarDetails> getCarByName(String carname);
	 
	 CarDetails saveCar(CarDetails carDetails);
	 
	 void deleteCarById(Integer carid);
}
