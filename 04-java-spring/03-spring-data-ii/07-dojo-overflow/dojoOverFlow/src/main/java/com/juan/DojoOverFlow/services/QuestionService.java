package com.juan.DojoOverFlow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.DojoOverFlow.models.Question;
import com.juan.DojoOverFlow.repositions.QuestionRepository;

@Service
public class QuestionService {
	private QuestionRepository qRepo;
	
	public QuestionService(QuestionRepository questionRepository) {
		this.qRepo = questionRepository;
	}
	// Retrieve All
	public List<Question> getAllQuestions() {
		return this.qRepo.findAll();
	}
	
	// Create
	public Question createQuestion(Question newQuestion) {
		return this.qRepo.save(newQuestion);
	}
	public Question createQuestion(String text) {
		Question newQuestion = new Question();
		return this.qRepo.save(newQuestion);
	}
	
	// Read
	public Question getSingleQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
}
