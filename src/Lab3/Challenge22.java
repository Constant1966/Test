package Lab3;
//Challenge 22
import java.util.Scanner;
public class Challenge22 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter your firstname in lowercase:");
		String firstname = user.nextLine();
		System.out.println("Enter your surname in lowercase:");
		String surname = user.nextLine();
		
		String tous = firstname+" "+surname;
//		there is the first part
		
//		create an array
		String[] tab = tous.split(" ");
		
//		now create a loop
		String space = "";
		for (int x = 0; x < tab.length; x++)
		{
			char love = tab[x].charAt(0);
			
			String val = String.valueOf(love).toUpperCase();
			String value = tab[x].substring(1);
			
//			String finale = val + value;
			space = space + val + value + " ";
		}
		System.out.print(space.trim());
	}
	

}
