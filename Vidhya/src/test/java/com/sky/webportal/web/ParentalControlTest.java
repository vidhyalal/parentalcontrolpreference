package com.sky.webportal.web;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.sky.webportal.web.dao.ParentalControlDao;
import com.sky.webportal.web.service.MovieService;
import com.sky.webportal.web.service.impl.ParentalControlServiceImpl;
/**
 * 
 * @author vidhya
 * This class uses Mockito for mock testing the two services
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ParentalControlTest {
	@Mock
	MovieService movieService;
	@Mock
	ParentalControlDao pd;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testMovieService() throws IOException {
		List<Integer> expected = new ArrayList<Integer>();
		Mockito.when(movieService.getParentalControlLevel("harrypotter"))
				.thenReturn(expected);
	}

}
