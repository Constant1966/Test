package Lab2;
//Challenge 18
import java.util.Scanner;
public class Partie18 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = user.nextInt();
		
		if (number < 10)
		{
			System.out.println("Too low");
		}
		
		else if(number ==10 || number <= 20)
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Too high");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
