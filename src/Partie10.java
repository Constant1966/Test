//Challenge 10
import java.util.Scanner;
public class Partie10 {

	public static void main(String[] args) 
	{
		Scanner pound = new Scanner(System.in);
		
		System.out.println("Enter the number of kilos:");
		int pois = pound.nextInt();
		
		double total = pois * 2.204;
		System.out.println("That is "+ total);
		
	}

}
