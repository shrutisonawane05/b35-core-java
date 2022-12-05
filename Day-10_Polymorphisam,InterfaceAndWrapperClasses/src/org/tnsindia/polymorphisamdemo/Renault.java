package org.tnsindia.polymorphisamdemo;

// Demo on constructor Overloading

          	public class Renault {
        	  public String model;
        	  public String engine;
	
	//constructor overloading 
	//parameterized constructor 
	Renault( String model,String engine)
	{
		System.out.println(" Model name is:" +model
				+ "engine is :"+engine);
		 
	}
	//parameterized constructor 
	Renault( String model)
	
	{
		System.out.println(" Model name is:" +model);
	}

}
