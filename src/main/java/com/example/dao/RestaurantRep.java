package com.example.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;



import com.example.model.Restaurant;

public interface RestaurantRep extends JpaRepository<Restaurant, Integer> {
	List <Restaurant> findAll(Sort sort);

}
