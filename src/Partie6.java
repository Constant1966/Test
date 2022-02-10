//Challenge 6
import java.util.Scanner;
public class Partie6 {

	public static void main(String[] args) 
	{
		Scanner slices = new Scanner(System.in);
		
		System.out.println("How many slices of pizza started: ");
		int pizza = slices.nextInt();
		
		System.out.println("How many slices they have heaten: ");
		int eat = slices.nextInt();
		
		int answer = pizza - eat;
		
		System.out.println("They left "+ answer + " pizza");
	
	}

}
