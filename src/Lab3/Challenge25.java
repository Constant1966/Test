package Lab3;
//Challenge 25
import java.util.Scanner;
public class Challenge25 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String firstname = user.nextLine();
		
		if(firstname.length()< 5)
		{
			System.out.println("Enter your surname:");
			String surname = user.nextLine();
			
			String together = (firstname+surname).toUpperCase();
			System.out.println(together);
		}
		else 
		{
			System.out.println(firstname.toLowerCase());
		}
		
	}

}
