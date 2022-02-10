//Challenge 2
import java.util.Scanner;

public class Partie2 {

	public static void main(String[] args) 
	{
		Scanner both = new Scanner(System.in);
		
		System.out.println("Enter your firstname:");
		String firstname = both.nextLine();
		
		System.out.println("Enter your surname:");
		String surname = both.nextLine();
		
		System.out.println("Hello "+ firstname +" "+ surname);
	}

}
