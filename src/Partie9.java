//Challenge 9
import java.util.Scanner;
public class Partie9 {

	public static void main(String[] args) 
	{
		Scanner day = new Scanner(System.in);
		
		System.out.println("Enter a number of days:");
		int number = day.nextInt();
		
		int hours = number * 24;
		int minutes = hours * 60;
		int second = minutes * 60;
		
		System.out.println("There are "+hours + " hour in this number of days");
		System.out.println("There are "+minutes + " minute in this number of days");
		System.out.println("There are "+second + " second in this number of days");

	}

}
