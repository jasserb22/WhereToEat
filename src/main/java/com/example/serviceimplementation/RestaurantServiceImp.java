package com.example.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.dao.RestaurantRep;

import com.example.model.Restaurant;
import com.example.serviceinterface.RestaurantInterface;

@Service
public class RestaurantServiceImp implements RestaurantInterface {

	@Autowired 
	  private RestaurantRep restaurantRep;
	@Override
	public Restaurant savelist(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return restaurantRep.save(restaurant);
	}

	@Override
	public Restaurant updatelist(@PathVariable int id,Restaurant restaurant) {
		// TODO Auto-generated method stub
		return restaurantRep.save(restaurant);
	}

	@Override
	public void deleteList(int id) {
		// TODO Auto-generated method stub
		restaurantRep.deleteById(id);
	}

}
