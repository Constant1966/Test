//Challenge 5
import java.util.Scanner;
public class Partie5 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter a first number:");
		int num1 = user.nextInt();
		
		System.out.println("Enter a second number:");
		int num2 = user.nextInt();
		
		System.out.println("Enter a third number:");
		int num3 = user.nextInt();
		
		int answer = (num1 + num2) * num3;
		
		System.out.println("The answer is: "+answer);
		
	}

}
