package Lab2;
//Challenge 17
import java.util.Scanner;
public class Partie17 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = user.nextInt();
		
		if (age == 18)
		{
			System.out.println("You can vote");
		}
		else if  (age == 17)
		{
			System.out.println("You learn to drive");
		}
		else if (age == 16)
		{
			System.out.println("You can buy a lottery ticket");
		}
		else if (age < 16)
		{
			System.out.println("You can go Trick-or-Treating");
		}
		

	}

}
