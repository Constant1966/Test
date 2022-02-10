package Lab2;
//Challenge 12
import java.util.Scanner;
public class Partie12 {

	public static void main(String[] args) 
	{
		Scanner two = new Scanner(System.in);
		
		System.out.println("Enter your first number:");
		int numb1 = two.nextInt();
		
		System.out.println("Enter your seconde number:");
		int numb2 = two.nextInt();
		
		if (numb1 > numb2) 
		{
			System.out.printf("The second number %d \nThe first number %d", numb2, numb1);
		}
		else 
		{
			System.out.printf("The first number %d \nThe second number %d", numb1, numb2);
		}
		
	}

}
