package com.sky.webportal.web.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.webportal.web.dao.MovieDao;
import com.sky.webportal.web.service.MovieService;
/**
 * 
 * @author vidhya
 * This class implements the movie service
 *
 */
@Service("movieService")
public class MovieServiceImpl implements MovieService {
	Logger logger = LoggerFactory.getLogger(MovieServiceImpl.class);

	@Autowired
	MovieDao movieDao;

	@Override
	public List<Integer> getParentalControlLevel(String movieId) {
		logger.info("controlId for movieId: "
				+ movieDao.getParentalControlLevel(movieId));
		return movieDao.getParentalControlLevel(movieId);
	}

}
