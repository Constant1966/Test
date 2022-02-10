package Lab3;
//Challenge 23
import java.util.Scanner;
public class Challenge23 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter the first line of a nursery rhyme");
		String phrase = user.nextLine();
		
		System.out.printf("This has %d letters in it\n", phrase.length());
		
		System.out.println("\nEnter a starting number:");
		int start = user.nextInt();
		
		System.out.println("Enter an and number:");
		int end = user.nextInt();
		
		String part = phrase.substring(start, end);
		System.out.println(part);
	}
}
