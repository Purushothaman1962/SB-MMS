package com.mms.bean;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_mms")
public class Movie {
	
	@Id
	@Column(name="movie_id")
	private int movieId;
	
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="movie_type")
	private String movieType;
	
	@Column(name="movie_language")
	private String movieLanguage;
	
	@Column(name="movie_duration")
	private String movieDuration;
	
	public Movie() {
		super();
	}
	public Movie(int movieId, String movieName, String movieType, String movieLanguage, String movieDuration) {
		super();
		this.movieid = movieId;
		this.movieName = movieName;
		this.movieType = movieType;
		this.movieLanguage = movieLanguage;
		this.movieDuration = movieDuration;
	}
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieType() {
		return movieType;
	}
	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public String getMovieDuration() {
		return movieDuration;
	}
	public void setMovieDuration(String movieDuration) {
		this.movieDuration = movieDuration;
	}

}
