package com.dxb;

import java.io.Serializable;



/**
 * 
 * @author Venkateshkumar S
 *
 */
public class Vehicle implements Serializable {
	
	private String year;
	private String category;
	private String modelName;
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the modelName
	 */
	public String getModelName() {
		return modelName;
	}
	/**
	 * @param modelName the modelName to set
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public Vehicle(String year, String category, String modelName) {
		super();
		this.year = year;
		this.category = category;
		this.modelName = modelName;
	}
	public Vehicle() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [year=" + year + ", category=" + category + ", modelName=" + modelName + "]";
	}
	
	
	
	
	
	

}
