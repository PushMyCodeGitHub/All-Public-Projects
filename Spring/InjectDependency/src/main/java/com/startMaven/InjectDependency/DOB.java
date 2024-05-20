package com.startMaven.InjectDependency;

public class DOB {
	 int dd;
	  String mm;
	  int yy;
	public DOB(int dd, String mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	@Override
	public String toString() {
		return "DOB [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	  

}
