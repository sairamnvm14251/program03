package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Movie;
import com.example.demo.hsqldbdao.CustomerRatingRepository;

@RestController
public class Rating {

	

	@Autowired
	private CustomerRatingRepository repo;

	
	@GetMapping(value = "path/api/rest/customer/{id}/rate/{rating}", produces = "application/json")
	
	//added from local
	public Iterable<Movie> customerRating(@PathVariable("id") Integer id, @PathVariable("rating") Integer rating) {
		System.out.println(id + "," + rating);
		Movie m=new Movie();
		m.setAverageRating(id);
		m.setFirstName("jack");
		m.setLastName("Baeur");
		m.setAverageRating(rating);
		m.setCustomerAverageRating(2.32);		
		repo.save(m);	
		
	 Iterable<Movie> optionalEntity = repo.findAll();
	 
		System.out.println("movie rating"+optionalEntity);
		return optionalEntity;

	}

}
