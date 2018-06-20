package com.sky.webportal.web.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.sky.webportal.web.dao.MovieDao;

/**
 * @author vidhya 
 * This class is to get the preference for given movie
 *
 */
@Service
public class MovieDaoImpl extends HibernateDaoSupport implements MovieDao {

	@Autowired
	public void setMySessionFactory(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> getParentalControlLevel(String movieId) {
		movieId = movieId.toUpperCase();
		return (List<Integer>) getHibernateTemplate()
				.findByNamedParam(
						"select controlId from ParentalControl where movieId = :movieId",
						"movieId", movieId);
	}

}
