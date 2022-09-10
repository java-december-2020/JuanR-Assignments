package com.juan.test3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.test3.models.Course;
import com.juan.test3.models.User;
import com.juan.test3.repositories.CourseRepository;

@Service
public class CourseService {
	@Autowired
	private CourseRepository cRepo;
	
	public Course findOneCourse(Long id) {
		Course course = this.cRepo.findById(id).orElse(null);
		return course;
	}
	
	public List<Course> getAllCourses() {
		return this.cRepo.findAll();
	}
	
	// Create
	public Course create(Course course) {
		return this.cRepo.save(course);
	}
	
	// Read
	public Course getSingleCourse(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	// Update
	public Course updateCourse(Course updatedCourse) {
		return this.cRepo.save(updatedCourse);
	}
	
	public void addAdder(User user, Course course) {
		List<User> adders = course.getAdders();
		adders.remove(user);
		this.cRepo.save(course);
		
		
	}
}
