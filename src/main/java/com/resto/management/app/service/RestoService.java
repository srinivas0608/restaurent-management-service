package com.resto.management.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.resto.management.app.dao.RestoDao;
import com.resto.management.app.entity.Restaurent;
import lombok.Data;

@Service
@Data
@Transactional
public class RestoService {
	
	private final RestoDao restoDao;
	
	public Restaurent addRestaurent(Restaurent resto) {
		return restoDao.addRestaurent(resto);
	}
	
	public List<Restaurent> getRestauants(){
		return restoDao.getRestaurants();
	}
	
	public Restaurent updateRestaurant(Restaurent resto, Integer id) {
		return restoDao.updateRestaurent(resto, id);
	}
	
	public Restaurent getRestaurantById(Integer restoId) {
		Optional<Restaurent> restoResult = restoDao.getRestaurentById(restoId);
			return restoResult.get();
	}
	
	public void deleteRestaurantById(Integer restoId) {
		restoDao.deleteRestaurant(restoId);
	}
	
}
