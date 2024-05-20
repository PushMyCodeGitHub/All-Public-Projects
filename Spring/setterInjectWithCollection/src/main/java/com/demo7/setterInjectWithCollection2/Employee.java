package com.demo7.setterInjectWithCollection2;

import java.util.List;
import java.util.Map;

public class Employee {
	  private int id;
	  private String name;
	  private List<Desiganation> d1;
	  private Map<String, Location> m1;
	  
	  
	
	  
	public Map<String, Location> getM1() {
		return m1;
	}
	public void setM1(Map<String, Location> m1) {
		this.m1 = m1;
	}
	public List<Desiganation> getD1() {
		return d1;
	}
	public void setD1(List<Desiganation> d1) {
		this.d1 = d1;
	}
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", d1=" + d1 + ", m1=" + m1 + "]";
	}

	  
	     
	  
	  

}
