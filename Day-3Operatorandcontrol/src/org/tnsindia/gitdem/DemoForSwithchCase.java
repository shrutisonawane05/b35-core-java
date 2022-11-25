package org.tnsindia.gitdem;

import java.util.Scanner;

public class DemoForSwithchCase {

	public static void main(String[] args) {
	
		
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the input");
				 int a=s.nextInt();
				 switch(a)
				 {
				 case 1:
					 System.out.println("shrivalli");
					 break;
				 case 2:
					 System.out.println("heyyy");
					 break;
				 case 3:
					 System.out.println("harsha");

					 break;
				 default:
					 System.out.println("invalid input");

					 s.close();

				 }

			}
		}
