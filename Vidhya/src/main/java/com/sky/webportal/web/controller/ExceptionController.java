package com.sky.webportal.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.sky.webportal.web.exception.TechnicalFailureException;
import com.sky.webportal.web.exception.TitleNotFoundException;

/**
 * @author vidhya 
 * This class is to handle the customized exceptions
 */
@ControllerAdvice
public class ExceptionController {
	/**
	 * This class is to throw the exception for movies not in db
	 * 
	 * @param request
	 * @param ex
	 * @return titleerror page
	 */
	String pageName=null;
	final String exception="exception";
	final String url="url";
	@ExceptionHandler(TitleNotFoundException.class)
	public ModelAndView handleTitleException(HttpServletRequest request,
			TitleNotFoundException ex) {
		ModelAndView mv = new ModelAndView();
		pageName="titleerror";
		mv.addObject(exception, ex.getLocalizedMessage());
		mv.addObject(url, request.getRequestURL());
		mv.setViewName(pageName);
		return mv;
	}

	/**
	 * This class is to throw the exception if preference level exceeded the
	 * movie's preference
	 * 
	 * @param request
	 * @param ex
	 * @return exceederror page
	 */
	@ExceptionHandler(TechnicalFailureException.class)
	public ModelAndView handleException(HttpServletRequest request,
			TechnicalFailureException ex) {
		ModelAndView mv = new ModelAndView();
		pageName="exceederror";
		mv.addObject(exception, ex.getLocalizedMessage());
		mv.addObject(url, request.getRequestURL());
		mv.setViewName(pageName);
		return mv;
	}

	/**
	 * This method is to handle rest of all exceptions
	 * 
	 * @param request
	 * @param ex
	 * @return error page
	 */
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(HttpServletRequest request, Exception ex) {
		ModelAndView mv = new ModelAndView();
		pageName="error";
		mv.addObject(exception, ex.getLocalizedMessage());
		mv.addObject(url, request.getRequestURL());
		mv.setViewName(pageName);
		return mv;
	}
}
