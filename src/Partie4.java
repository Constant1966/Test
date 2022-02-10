//Challenge 4
import java.util.Scanner;

public class Partie4 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter your first number:");
		int num = user.nextInt();
		System.out.println("Enter your second number:");
		int num2 = user.nextInt();
		
		int total = num + num2;
		
		System.out.println("The total is "+ total);
		
	}

}
