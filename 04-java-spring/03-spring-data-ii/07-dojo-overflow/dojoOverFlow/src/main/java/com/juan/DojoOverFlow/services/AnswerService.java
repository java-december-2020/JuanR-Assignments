package com.juan.DojoOverFlow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.DojoOverFlow.models.Answer;
import com.juan.DojoOverFlow.repositions.AnswerRepository;

@Service
public class AnswerService {
	// Dependency injects Dog Repository to have access to CRUD and findAll methods
	private AnswerRepository aRepo;
	
	public AnswerService(AnswerRepository answerRepository) {
		this.aRepo = answerRepository;
	}
	// Retrieve All
	public List<Answer> getAllAnswers() {
		return this.aRepo.findAll();
	}
	
	// Create
	public Answer createAnswer(Answer newAnswer) {
		return this.aRepo.save(newAnswer);
	}
	public Answer createAnswer(String text) {
		Answer newAnswer = new Answer();
		return this.aRepo.save(newAnswer);
	}
	
	// Read
	public Answer getSingleAnswer(Long id) {
		return this.aRepo.findById(id).orElse(null);
	}
}

