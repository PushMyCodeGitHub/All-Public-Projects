package com.demo;

public class Reservation {
	
	    private String  firstname;
	    private String lastname;
	    
	    private String gender;
	    
	     private String []food;
	      
	      private String cityFrom;
	      private String cityTo;
	      
	    
	    
	    
	    
	
		public Reservation() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
	
		public String getCityFrom() {
			return cityFrom;
		}
		public void setCityFrom(String cityFrom) {
			this.cityFrom = cityFrom;
		}
		public String getCityTo() {
			return cityTo;
		}
		public void setCityTo(String cityTo) {
			this.cityTo = cityTo;
		}

		public String[] getFood() {
			return food;
		}

		public void setFood(String[] food) {
			this.food = food;
		}
	    
	    
	    
	    

}
