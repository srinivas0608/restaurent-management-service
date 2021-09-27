package com.resto.management.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.resto.management.app.entity.Restaurent;
import com.resto.management.app.repository.RestoRepository;

import lombok.Data;

@Data
@Repository
public class RestoDao {
	
	private final RestoRepository repo;
	
	public Restaurent addRestaurent(Restaurent restaurant) {
		return repo.save(restaurant);
	}
	
	public List<Restaurent> getRestaurants(){
		return repo.findAll();
	}
	
	public Restaurent updateRestaurent(Restaurent restaurant, Integer id) {
		Optional<Restaurent> findById = repo.findById(id);
		return repo.save(restaurant);
	}
	
	public Optional<Restaurent> getRestaurentById(Integer restaurantId) {
		return repo.findById(restaurantId);
	}
	
	public void deleteRestaurant(Integer restaurantId) {
		repo.deleteById(restaurantId);
	}

}
