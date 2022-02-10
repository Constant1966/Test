//Challenge 8
import java.util.Scanner;
public class Partie8 {

	public static void main(String[] args) 
	{
		Scanner bill = new Scanner(System.in);
		
		System.out.println("How much the total price?:");
		double price = bill.nextDouble();
		
		System.out.println("How many diners there are?:");
		int diners = bill.nextInt();
		
		double divide = price / diners;
		System.out.println("Each person must pay: "+divide);
	}

}
