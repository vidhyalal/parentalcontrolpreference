package com.sky.webportal.web.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.webportal.web.dao.ParentalControlDao;
import com.sky.webportal.web.exception.TechnicalFailureException;
import com.sky.webportal.web.exception.TitleNotFoundException;
import com.sky.webportal.web.service.MovieService;
import com.sky.webportal.web.service.ParentalControlService;

/**
 * 
 * @author vidhya 
 * This class implements the parental control service 
 * and throws user defined exceptions for failure cases
 *
 */
@Service("parentalControlService")
public class ParentalControlServiceImpl implements ParentalControlService {
	Logger logger = LoggerFactory.getLogger(ParentalControlServiceImpl.class);

	@Autowired
	MovieService movie;

	@Autowired
	ParentalControlDao controlDao;

	Boolean choice = false;

	@Override
	public Boolean getPreferenceLevel(String movieId, String controlLevel) {

		List<Integer> controlId = controlDao.getPrefernceLevel(controlLevel);
		List<Integer> movieControlId = movie.getParentalControlLevel(movieId);
		logger.info("controlId: " + controlId + " movieControlId: "
				+ movieControlId);
		if (movieControlId.size() == 0)
			throw new TitleNotFoundException(movieId, "Movie not found");
		else {
			int control = controlId.get(0);
			int movieControl = movieControlId.get(0);
			logger.info("control: " + control + " movieControl: "
					+ movieControl);
			if (movieControl <= control) {
				choice = true;
			} else {
				throw new TechnicalFailureException("Movie exceeds preference");
			}
		}

		logger.info("choice is " + choice);
		return choice;

	}

}
