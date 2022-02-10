package Lab2;
//Challenge 16
import java.util.Scanner;
public class Partie16 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("It's raining?");
		String rain = user.nextLine().toLowerCase();
		
		if (rain.equals("yes"))
		{
			System.out.println("It is windy?");
			String windy = user.nextLine().toLowerCase();
			
			if (windy.equals("yes"))
			{
				System.out.println("It is to windy too windy for umbrella");
			}
			
			else
			{
				System.out.println("Take an umbrella");
			}
		}
		else
		{
			System.out.println("Enjoy your day");
		}
	}
	

}
