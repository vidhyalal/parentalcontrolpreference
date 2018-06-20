package com.sky.webportal.web.service;

import java.util.List;
/**
 * 
 * @author vidhya
 * This class makes service call to get preferencelevel for given movie
 *
 */
public interface MovieService {

	public List<Integer> getParentalControlLevel(String movieId);
}
