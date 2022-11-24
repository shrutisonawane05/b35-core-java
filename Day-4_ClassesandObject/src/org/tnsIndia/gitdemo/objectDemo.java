package org.tnsIndia.gitdemo;

import java.util.Scanner;

public class objectDemo {
	
		//Driver class
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the speed of the car:");
			int speed=s.nextInt();

			//creation of object
			CarDemo obj=new CarDemo();

			//compile time input
			//obj.speed=45;
			obj.speed(speed);
			s.close();



		}

	}

