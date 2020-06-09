package com.capgemini.carwash.entity;

import java.util.Date;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "tbl_orderdetails")
public class OrderDetails {

	@Id
	private String order_id;
	
	@NotEmpty
	private Date orderdate;
	
	@NotEmpty
	private Date completiondate;
	
	@NotEmpty
	private String worklocation;
}