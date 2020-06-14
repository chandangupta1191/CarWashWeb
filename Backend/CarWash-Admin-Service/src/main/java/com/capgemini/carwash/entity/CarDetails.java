package com.capgemini.carwash.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "tbl_cardetails")
public class CarDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carid;
	
	@NotEmpty
	private String carname;
    
    @NotEmpty
    private String car_type;
    
    @NotEmpty
    private String colour;
    
    @NotEmpty
    private String reg_number;
    
    @NotEmpty
    private String imageUrl;
}
