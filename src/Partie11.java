//Challenge 11
import java.util.Scanner;
public class Partie11 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter a number over 100:");
		int num = user.nextInt();
		
		System.out.println("Enter a number under 10:");
		int num2 = user.nextInt();
		
		int result = (num /= num2); // "/=" without decimal
		System.out.printf("There are %d in %d", result, num);
	}

}
