package packagesexecutor;

import java.util.Scanner;

	//importing the class of another package
		//import org.tnsindia.packagesdemo.ATM;
		import org.tnsindia.packagesdemo.*;

public class ATMExecutor {

	public static void main(String[] args) {
		

		

		//driver class

				Scanner s=new Scanner(System.in);
				System.out.println("Enter the card_no:");
				String card_no=s.nextLine();
				ATMExecutor obj=new ATMExecutor();
				obj.display(card_no);
				s.close();

		}

}
