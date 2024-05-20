package com.demo6.CIwithNon_STringMApDO;

import java.util.Map;

public class Actore {
	
	   private int id;
	   private String name;
	   private Map<Moveis,Directore> m1;
	public Actore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Actore(int id, String name, Map<Moveis, Directore> m1) {
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
