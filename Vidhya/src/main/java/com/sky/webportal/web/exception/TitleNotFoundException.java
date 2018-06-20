package com.sky.webportal.web.exception;
/**
 * 
 * @author vidhya
 * Exception class for movies not in db
 *
 */
@SuppressWarnings("serial")
public class TitleNotFoundException extends RuntimeException {
	private String movieId;

	public TitleNotFoundException(String movieId, String message) {
		super(message);
		this.movieId = movieId;
	}
}
