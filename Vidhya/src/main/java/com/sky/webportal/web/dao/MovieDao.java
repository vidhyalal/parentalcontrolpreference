package com.sky.webportal.web.dao;

import java.util.List;
/**
 * 
 * @author vidhya
 * Dao layer for the Movie Service
 */
public interface MovieDao {

	public List<Integer> getParentalControlLevel(String movieId);

}
