package com.sky.webportal.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
/**
 * 
 * @author vidhya
 * This class manages the login for the application
 *
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("admin")
				.roles("USER", "ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/login").permitAll()
				.antMatchers("/", "/*products*/**").access("hasRole('USER')")
				.and().formLogin();
	}
}
