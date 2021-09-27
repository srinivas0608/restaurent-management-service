package com.resto.management.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.resto.management.app.entity.Restaurent;
import com.resto.management.app.service.RestoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RestoController {
	
	@Autowired
	private RestoService service;

	@PostMapping(value = "/restaurants")
	public ResponseEntity<Restaurent> addRestaurent(@Valid @RequestBody Restaurent resto) {
		Restaurent addRestaurent = service.addRestaurent(resto);
		return new ResponseEntity<>(addRestaurent, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/restaurants")
	public List<Restaurent> getRestaurants(){
		return service.getRestauants();
	}
	
	@PutMapping(value = "/restaurants/{id}")
	public ResponseEntity<Restaurent> updateRestaurent(@Valid @RequestBody Restaurent resto, @PathVariable Integer id) {
		Restaurent updatedRestaurent = service.updateRestaurant(resto, id);
		return new ResponseEntity<>(updatedRestaurent, HttpStatus.OK);
	}
	
	@GetMapping(value = "/restaurants/{id}")
	public ResponseEntity<Restaurent> getRestaurentById(@PathVariable Integer id) {
		Restaurent updatedRestaurent = service.getRestaurantById(id);
		return new ResponseEntity<>(updatedRestaurent, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/restaurants/{id}")
	public ResponseEntity<String> deleteRestaurentById(@PathVariable Integer id) {
		service.deleteRestaurantById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
