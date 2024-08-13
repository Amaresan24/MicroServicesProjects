package com.MongoProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Movie_details")
public class Movies {
	@Id

	private int id;
	private String heroname;
	private String reldate;
	private long budget;

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
