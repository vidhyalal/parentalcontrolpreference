package com.sky.webportal.web.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.sky.webportal.web.dao.ParentalControlDao;

/**
 * @author vidhya 
 * This class is to get the given preference level details
 */
@Service
public class ParentalControlDaoImpl extends HibernateDaoSupport implements
		ParentalControlDao {

	@Autowired
	public void setMySessionFactory(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> getPrefernceLevel(String controlLevel) {
		return (List<Integer>) getHibernateTemplate()
				.findByNamedParam(
						"select controlId from Preference where controlLevel = :controlLevel",
						"controlLevel", controlLevel);
	}
}
