package com.resto.management.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.resto.management.app.entity.Restaurent;

public interface RestoRepository extends CrudRepository<Restaurent, Integer> {
	
	 List<Restaurent> findAll();


}
