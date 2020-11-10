package com.example.serviceinterface;




import com.example.model.Restaurant;

public interface RestaurantInterface {
	public	 Restaurant savelist(Restaurant restaurant);
	
	// to update list 
	
	Restaurant updatelist(int id, Restaurant restaurant);
	 // to fetch all list from database
	  
	

	 
	 // to delete list 
	  public  void deleteList(int id);
	 
	  
	 

}
