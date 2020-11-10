package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.RestaurantRep;

import com.example.model.Restaurant;
import com.example.serviceimplementation.RestaurantServiceImp;

@RestController
@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
@RequestMapping("/api/vi")
public class RestaurantController {
	@Autowired 
	private RestaurantRep restaurantRep;
	@Autowired
	private RestaurantServiceImp  restaurantserviceimp ;
	@PostMapping(value = "resto")
	public Restaurant savelist(@RequestBody Restaurant restaurant) {
		restaurantserviceimp.savelist(restaurant);
		
		return restaurant;
		
	}
	@PutMapping(value="resto/{id}")
	public Restaurant updatelist(@RequestBody Restaurant listtodo) {
		return restaurantserviceimp.updatelist(0, listtodo);
		
	}

	
	@DeleteMapping("resto/{id}")
	 public ResponseEntity<HttpStatus> deleteList(@PathVariable("id") int id) {
	   try {
	   restaurantRep.deleteById(id);
	     return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	   } catch (Exception e) {
	     return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	   }
	 }
	 @GetMapping(value ="resto")
	 public ResponseEntity<List<Restaurant>> findallLists(@RequestParam(defaultValue = "id,desc") String[] sort) {
		 try {
		      List<Restaurant> restaurant  = new ArrayList<Restaurant>();  
		
		
		 
	     restaurantRep.findAll(Sort.by("id").descending()).forEach(restaurant::add);
	     
	     
	     if (restaurant.isEmpty()) {
	       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	     }
	     return new ResponseEntity<>(restaurant, HttpStatus.OK);
		    } catch (Exception e) {
		      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		    }
		  }

}
