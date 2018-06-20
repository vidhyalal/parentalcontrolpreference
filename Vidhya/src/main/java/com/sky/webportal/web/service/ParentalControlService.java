package com.sky.webportal.web.service;

/**
 * @author vidhya 
 * This class provides service call to check given movie
 * preference with db preference
 *
 */
public interface ParentalControlService {

	Boolean getPreferenceLevel(String movieId, String controlLevel);

}
