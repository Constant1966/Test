package Lab2;
//Challenge 15
import java.util.Scanner;
public class Partie15 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter your favorite colour:");
		String color = user.nextLine();
		
		if (color.equals("Red") || color.equals("RED") || color.equals("red"))	
		{
			System.out.println("I like red too.");
		}
		else
		{
			System.out.printf("I don't like %s I prefer red.", color);
		}
		
	}

}
