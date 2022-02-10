package Lab2;
//Challenge 14
import java.util.Scanner;
public class Partie14 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter a number between 10 and 20:");
		int num = user.nextInt();
		
		if (num >= 10 && num <= 20) 
		{
			System.out.println("Thank you");
		}
		else
		{
			System.out.println("Incorrect answer");
		}
	}

}
