package com.juan.DojoOverFlow.repositions;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juan.DojoOverFlow.models.Tag;

@Repository
public interface TagRepository extends CrudRepository <Tag, Long>{
	List<Tag> findAll();
}
