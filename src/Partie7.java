//Challenge 7
import java.util.Scanner;
public class Partie7 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = user.nextLine();
		
		System.out.println("Enter your age:");
		int age = user.nextInt();
		
		int newyear = age + 1;
		
		System.out.println("Your name is "+ name +" next year you will be "+newyear);
	}

}
