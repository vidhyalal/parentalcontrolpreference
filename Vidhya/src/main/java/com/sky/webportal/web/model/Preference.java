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
 * Model Class for ParentalControl Service. Also creates a table in db for given column
 *
 */
@Entity
@Table(name = "preference")
public class Preference {

	@Id
	@Column
	private String controlLevel;
	private int controlId;

	public String getControlLevel() {
		return controlLevel;
	}

	public void setControlLevel(String controlLevel) {
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
		builder.append("controlId=");
		builder.append(controlId);
		builder.append(" ,controlLevel=");
		builder.append(controlLevel);
		return builder.toString();
	}

}
