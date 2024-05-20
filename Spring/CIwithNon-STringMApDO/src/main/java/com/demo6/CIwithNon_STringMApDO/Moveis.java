package com.demo6.CIwithNon_STringMApDO;

public class Moveis {
	
	   private int id;
	   private String m_name;
	   
	public Moveis() {
		super();
	}

	public Moveis(int id, String m_name) {
		super();
		this.id = id;
		this.m_name = m_name;
	}

	@Override
	public String toString() {
		return "Moveis [id=" + id + ", m_name=" + m_name + "]";
	}
	   
	   

}
