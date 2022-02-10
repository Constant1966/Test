package Lab2;
//Challenge 19
import java.util.Scanner;
public class Partie19 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter 1, 2 or 3:");
		int enter = user.nextInt();
		
		switch(enter)
		{
		case 1:
			System.out.println("Thank you");
			break;
		case 2:
			System.out.println("Well done");
			break;
		case 3:
			System.out.println("Correct");
			break;
		
		default:
			System.out.println("Error message");
		}
		
	}

}
