package com.demo5.CiwithMAp;

import java.util.Map;

public class Actore {
	
	
	      private int id;
	      private String name;
	      private Map<String, String>  movies;
		public Actore() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Actore(int id, String name, Map<String, String> movies) {
			super();
			this.id = id;
			this.name = name;
			this.movies = movies;
		}
		@Override
		public String toString() {
			return "Actore [id=" + id + ", name=" + name + ", movies=" + movies + "]";
		}
	      
	      
	      
	      
	      
	      
	       
	      

}
