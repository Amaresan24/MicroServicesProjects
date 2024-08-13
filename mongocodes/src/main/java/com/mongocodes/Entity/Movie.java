package com.mongocodes.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Document(collection = "Movie_details")
@Entity
public class Movie {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String heroname;
	private String reldate;
	private long  budget;
	public int getId() {
		return id;
	}
	public String getHeroname() {
		return heroname;
	}
	public String getReldate() {
		return reldate;
	}
	public long getBudget() {
		return budget;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setHeroname(String heroname) {
		this.heroname = heroname;
	}
	public void setReldate(String reldate) {
		this.reldate = reldate;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	
	

	

}
