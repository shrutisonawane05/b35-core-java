package org.tnsindia.abstractdemo;

public class ATMMachineExecutor {
		//driver class
	

			public static void main(String[] args) {
				ATMMachine a=new ATMMachineChild();
				//ATMMachineChild a=new ATMMachineChild();
				a.withdraw();
				a.display();

			}
		}

	

