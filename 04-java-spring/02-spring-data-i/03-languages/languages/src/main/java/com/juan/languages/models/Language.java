package com.juan.languages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="languages")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(max=30)
	// @NotEmpty // valid as long as its not null and its size length is greater than zero but allows for white spaces
	@NotBlank
	private String name;
	@NotBlank
	private String creator;
	@NotNull
	private int version;
	
	// STEP 22 AND AFTER UP TO LINE 48
	@Column(updatable=false)
	@DateTimeFormat(pattern = "yyy-MM-DD hh:mm:ss")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyy-MM-DD hh:mm:ss")
	private Date updatedAt;
	
	@PrePersist // BEFORE COMPILING WE WILL MAKE A NEW DATE OBJECT
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate // SAME AS PREPERSIST BUT FOR SOMETHING THAT ALREADY EXSISTS
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Language() {

	}
	
	
	

	public Language(String name, String creator, int version) {
		this.name = name;
		this.creator = creator;
		this.version = version;
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

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
}