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
	private Movie movie;

	@Autowired
	private CustomerRatingRepository repo;

	@GetMapping(value = "path/api/rest/customer/{id}/rate/{rating}", produces = "application/json")
	
	public Movie customerRating(@PathVariable("id") int id, @PathVariable("rating") Long rating) {
		System.out.println(id + "," + rating);
		movie.setAverageRating(id);
		movie.setAverageRating(rating);
		
		Movie save = repo.save(movie);
		System.out.println("movie rating"+save);
		return save;

	}

}
