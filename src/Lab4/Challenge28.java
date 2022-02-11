package Lab4;
//Challenge 28
import java.util.Scanner;
public class Challenge28 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter a number with lots of decimal places:");
		double num = user.nextFloat();
		
		double answer = num * 2;
		
		System.out.println(answer);
		System.out.println(Math.round(answer));
		
		
		
	}

}
