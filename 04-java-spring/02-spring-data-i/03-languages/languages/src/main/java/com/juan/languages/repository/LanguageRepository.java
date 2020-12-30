package com.juan.languages.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juan.languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	List<Language> findAll(); // Finds all from Languages
}
