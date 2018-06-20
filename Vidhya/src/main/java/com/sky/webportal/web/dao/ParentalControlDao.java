package com.sky.webportal.web.dao;

import java.util.List;
/**
 * 
 * @author vidhya
 * Dao layer for the parentalControlService
 *
 */
public interface ParentalControlDao {

	public List<Integer> getPrefernceLevel(String controlLevel);
}
