package com.sky.webportal.web.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sky.webportal.web.service.ParentalControlService;

/**
 * @author vidhya 
 * Controller class to invoke service to check the user preference level with the db
 */
@Controller
public class MovieMvcController {

	Logger logger = LoggerFactory.getLogger(MovieMvcController.class);

	@Autowired
	ParentalControlService parentalControlService;

	@RequestMapping(value = "/movie", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Object saveUserChoice(HttpServletRequest request) {

		Map<String, String[]> parameterMap = request.getParameterMap();
		logger.info("parameterMap: " + parameterMap);
		String values[] = parameterMap.get("userOptions");
		List<String> selectedProducts = Arrays.asList(values);
		logger.info("selectedProducts " + selectedProducts);
		String preference = null;
		for (String val : values) {
			logger.info("Values " + val);
			preference = val;
		}

		String movies[] = parameterMap.get("movie");
		List<String> selectedMovies = Arrays.asList(movies);
		logger.info("selectedMovies " + selectedMovies);
		String movie = null;
		for (String val : movies) {
			logger.info("moviesL " + val);
			movie = val;
		}

		Boolean choice = parentalControlService.getPreferenceLevel(movie,
				preference);
		logger.info("choice: " + choice);
		ModelAndView model = new ModelAndView("result");
		model.addObject("choice", choice);
		return model;
	}

}
