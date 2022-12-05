package org.tnsindia.polymorphisamdemo;

//driver class

		public class MethodOverloadingExecutor {
				public static void main(String[] args) {
		//object creation
		MethodOverloadingExample m= new MethodOverloadingExample();
		//method calling
		m.addition(12, 10);
		m.addition(55, 40, 9);
		
		System.out.println();
		
		//object creation
		MethodOverloading m1=new MethodOverloading();
		//method calling
		m1.addition(22, 26);
		m1.addition(10.7f, 66);
		

	}

}
