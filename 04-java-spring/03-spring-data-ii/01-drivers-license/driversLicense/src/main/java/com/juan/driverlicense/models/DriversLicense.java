package com.juan.driverlicense.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="driverslicense")
public class DriversLicense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String first_name;
	private String last_name;
	private String state;
	private int expiration_date;
	
	
	public DriversLicense(String first_name, String last_name, String state, int expiration_date) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.state = state;
		this.expiration_date = expiration_date;
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getExpiration_date() {
		return expiration_date;
	}


	public void setExpiration_date(int expiration_date) {
		this.expiration_date = expiration_date;
	}

	



	
	
	
}
