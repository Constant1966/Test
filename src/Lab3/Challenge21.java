package Lab3;
//Challenge 21
import java.util.Scanner;
public class Challenge21 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstname = user.nextLine();
		
		System.out.println("Enter your surname:");
		String surname = user.nextLine();
		
		String ensemble = firstname +" "+surname;
		System.out.println(ensemble+"\n"+ "The whole length is "+ensemble.length());
	}

}
