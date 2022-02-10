package Lab2;
//Challenge 13
import java.util.Scanner;

public class Partie13 {

	public static void main(String[] args) 
	{
		Scanner under = new Scanner(System.in);
		
		System.out.println("Enter a number under 20:");
		int user = under.nextInt();
		
		if (user < 20) 
		{
			System.out.println("Thank you");
		}
		else
		{
			System.out.println("Too high");
		}
	}

}
