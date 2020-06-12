package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "movie")
@Data
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	//@Column(columnDefinition = "varchar(25) default 'jack'")
	private String firstName;
	//@Column(columnDefinition = "varchar(25) default 'Bauer'")
	private String lastName;

	private double customerAverageRating;

	private double averageRating;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getCustomerAverageRating() {
		return customerAverageRating;
	}

	public void setCustomerAverageRating(double customerAverageRating) {
		this.customerAverageRating = customerAverageRating;
	}

	public double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", customerAverageRating="
				+ customerAverageRating + ", averageRating=" + averageRating + "]";
	}

	
}
