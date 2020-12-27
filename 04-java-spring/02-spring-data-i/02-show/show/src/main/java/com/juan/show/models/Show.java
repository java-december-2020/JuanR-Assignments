package com.juan.show.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shows")
public class Show {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(max=30)
	@NotBlank
	private String name;
	@NotBlank
	private String lanugage;
	@NotBlank
	private int numofp;
	public Show(Long id, String name, String lanugage, int numofp) {
		this.id = id;
		this.name = name;
		this.lanugage = lanugage;
		this.numofp = numofp;
	}
	
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanugage() {
		return lanugage;
	}
	public void setLanugage(String lanugage) {
		this.lanugage = lanugage;
	}
	public int getNumofp() {
		return numofp;
	}
	public void setNumofp(int numofp) {
		this.numofp = numofp;
	}
	
	

}
