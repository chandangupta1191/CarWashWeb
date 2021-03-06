//package com.capgemini.carwash.entity;
//
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.FetchType;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.validation.constraints.NotEmpty;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.index.IndexDirection;
//import org.springframework.data.mongodb.core.index.Indexed;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import lombok.Data;
//
//@Document(collection = "tbl_customer")
//@Data
//public class Customer {
//
//	@Id
//	private String cust_id;
//	
//	@Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
//	
//	@NotEmpty
//	private String email;
//	
//	@JsonIgnore
//	@NotEmpty
//	private String password;
//	
//	@NotEmpty
//	private String username;
//	
//	@OneToMany(fetch=FetchType.LAZY, targetEntity=CarDetails.class, cascade=CascadeType.ALL)
//	@JoinColumn(name="cust_id", referencedColumnName="car_id")
//	private Set cars;
//}