package com.startMaven.InjectDependency;

public class Employee {

	private int id;
	  private String name;
	  
	  DOB d1;   //  DI
	  
	    public Employee()
	    {
             System.out.println("default constructore");
	    
	    
	    }

		public Employee(int id)
		{
			System.out.println("constructor call for id..");
			this.id = id;
	
		}
		public Employee( String name)
		{
		
			System.out.println("constructor call for name..");
			this.name = name;
		}
		public Employee(int id, String name)
		{
			System.out.println("constructor call for name. id.");
		
			this.id = id;
			this.name = name;
		}

		public Employee(int id, String name, DOB d1) {
			
			this.id = id;
			this.name = name;
			this.d1 = d1;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", d1=" + d1 + "]";
		}

}
