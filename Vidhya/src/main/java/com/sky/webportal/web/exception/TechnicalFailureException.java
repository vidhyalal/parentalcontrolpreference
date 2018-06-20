package com.sky.webportal.web.exception;

/**
 * 
 * @author vidhya 
 * Exception class for movie not in preference level
 *
 */
@SuppressWarnings("serial")
public class TechnicalFailureException extends RuntimeException {
	public TechnicalFailureException(String message) {
		super(message);
	}
}
