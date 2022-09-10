package com.juan.test3.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juan.test3.models.Course;

@Repository
public interface CourseRepository extends CrudRepository <Course, Long>{
	List<Course> findAll();
}	
