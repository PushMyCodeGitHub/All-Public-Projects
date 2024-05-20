package com.demo4.CIWNonStringColectionDo;

import java.util.List;

public class Actore {
	
	   private int id;
	   private String name;
	   
	   private List<Movies> m1;

	public Actore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actore(int id, String name, List<Movies> m1) {
		super();
		this.id = id;
		this.name = name;
		this.m1 = m1;
	}

	@Override
	public String toString() {
		return "Actore [id=" + id + ", name=" + name + ", m1=" + m1 + "]";
	}
	   
	     
	   
	   
	   
	   

}
