package com.devsuperior.dsmovie.entities;

import javax.persistence.Embeddable;

@Embeddable

public class ScorePK {

	
	
	private Movie movie;
	private User user;
	
	public ScorePK() {
		
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
