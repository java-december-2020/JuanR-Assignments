package com.juan.dogs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.dogs.models.Tag;
import com.juan.dogs.repositions.TagRepository;

@Service
public class TagService {
	@Autowired
	private TagRepository trepo;
	
	// Create
	
	public Tag create(Tag tag) {
		return this.trepo.save(tag);
	}
}
