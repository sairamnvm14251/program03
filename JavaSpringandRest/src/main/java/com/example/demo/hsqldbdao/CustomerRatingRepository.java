package com.example.demo.hsqldbdao;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Movie;

@Repository
public interface CustomerRatingRepository extends CrudRepository<Movie, Long> 
{
	
}