package com.juan.books.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(max=30)
	@NotBlank
	private String name;
	@NotBlank
	private String 
}
