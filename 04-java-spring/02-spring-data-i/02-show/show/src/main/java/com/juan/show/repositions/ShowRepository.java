package com.juan.show.repositions;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juan.show.models.Show;


@Repository
public interface ShowRepository extends CrudRepository<Show, Long> {
	List<Show> findAll(); // SELECT * FROM shows
}
