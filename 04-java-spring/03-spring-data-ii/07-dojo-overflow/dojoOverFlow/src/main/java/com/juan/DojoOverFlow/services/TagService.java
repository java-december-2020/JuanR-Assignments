package com.juan.DojoOverFlow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.DojoOverFlow.models.Tag;
import com.juan.DojoOverFlow.repositions.TagRepository;

@Service
public class TagService {
	// Dependency injects Tag repository to have access to CRUD commands
	private TagRepository tRepo;
	public TagService(TagRepository tagRepository) {
		this.tRepo = tagRepository;
	}
	
	// Retreive All
	public List<Tag> getAllTags() {
		return this.tRepo.findAll();
	}
	
	// Create 
	public Tag createTag(Tag newTag) {
		return this.tRepo.save(newTag);
	}
	public Tag createTag(String subject) {
		Tag newTag = new Tag();
		return this.tRepo.save(newTag);
	}
	
	// Read 
	public Tag getSingleTag(Long id) {
		return this.tRepo.findById(id).orElse(null);
	}
}
