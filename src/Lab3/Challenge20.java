package Lab3;
//Challenge 20
import java.util.Scanner;
public class Challenge20 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter your firstname:");
		String name = user.nextLine();
		
		System.out.println("Your name length is "+name.length());
	}

}
