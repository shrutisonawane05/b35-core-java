package org.tnsindia.polymorphisamdemo;

public class MethodOverloading {
	
	// Method Overloading
		//1.by having the differnt types of arguments
		
		public void addition(int x, int y)
		{
		
			System.out.println("The addition of x and y is : "+(x+y));
			
		}
		// if return type is different and parameter is same then its 
		
		public void addition(float x, int y)
		{
			System.out.println("The addition of x and y is : "+(x+y));
		}

}

