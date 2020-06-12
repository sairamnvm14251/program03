package com.example.demo.hsqldbdao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Movie;

@Repository
public interface CustomerRatingRepository extends CrudRepository<Movie, Serializable> 
{
	
	@Override Iterable<Movie> findAllById(Iterable<Serializable> id) ;
	
}