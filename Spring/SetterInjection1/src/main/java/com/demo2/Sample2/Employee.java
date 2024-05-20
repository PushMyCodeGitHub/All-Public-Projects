package com.demo2.Sample2;

public class Employee {
	  int id;
	  String name;
	  Address a1;
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
	//setter for ependant object
	public Address getA1() {
		return a1;
	}
	public void setA1(Address a1) {
		this.a1 = a1;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", a1=" + a1 + "]";
	}

	  
	  
	  

}
