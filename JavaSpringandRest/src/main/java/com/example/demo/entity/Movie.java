package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Entity
@Table(name = "movie")
@Data
@Repository
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(columnDefinition = "varchar(25) default 'jack'")
	private String firstName;
	@Column(columnDefinition = "varchar(25) default 'Bauer'")
	private String lastName;

	private Float customerAverageRating;

	private float averageRating;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public Float getCustomerAverageRating() {
		return customerAverageRating;
	}

	public void setCustomerAverageRating(Float customerAverageRating) {
		this.customerAverageRating = customerAverageRating;
	}

	public float getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", customerAverageRating="
				+ customerAverageRating + ", averageRating=" + averageRating + "]";
	}

}
