package Lab4;
//Challenge 33
import java.util.Scanner;
public class Challenge33 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int val = user.nextInt();
		
		System.out.println("Enter another number:");
		int num2 = user.nextInt();
		
		int ans1 = val /= num2;
		int ans2 = val % num2;
		
		System.out.println(val+" divided by " +num2+" is "+ ans1+ " with " +ans2+ " remaining.");
	}

}
