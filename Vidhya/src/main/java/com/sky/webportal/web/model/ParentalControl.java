package com.sky.webportal.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author vidhya 
 * Model Class for MovieService. Also creates a table in db for given column
 *
 */
@Entity
@Table(name = "parentalcontrol")
public class ParentalControl {

	@Id
	@Column
	private int controlId;
	private String movieId;
	private String controlLevel;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getControlLevel() {
		return controlLevel;
	}

	public void setControllevel(String controlLevel) {
		this.controlLevel = controlLevel;
	}

	public int getControlId() {
		return controlId;
	}

	public void setControlId(int controlId) {
		this.controlId = controlId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("movieId=");
		builder.append(movieId);
		builder.append(" , controlLevel=");
		builder.append(controlLevel);
		builder.append(" , controlId=");
		builder.append(controlId);
		return builder.toString();
	}
}
