package com.demo7.setterInjectWithCollection;

import java.util.List;
import java.util.Map;

public class Employee {
	  private int id;
	  private String name;
	  private List<String> Designation;
	  
	  private Map<String, String> location;
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getDesignation() {
		return Designation;
	}
	public void setDesignation(List<String> designation) {
		Designation = designation;
	}
	
	public Map<String, String> getLocation() {
		return location;
	}
	public void setLocation(Map<String, String> location) {
		this.location = location;
	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", Designation=" + Designation + "]";
//	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Designation=" + Designation + ", location=" + location
				+ "]";
	}
	  
	     
	  
	  

}
