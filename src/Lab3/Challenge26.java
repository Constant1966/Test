package Lab3;
//Challenge 26
import java.util.Scanner;
public class Challenge26 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		System.out.println("Please enter a word");
		String word = user.nextLine();
		
		String value = word.substring(0, 1);
		int len = word.length();
		String rest = word.substring(1, len);
		
		if (value.equals("a") || value.equals("e") || value.equals("i") || value.equals("o") || value.equals("u") || value.equals("y"))
		{
			String newword = word + "way";
			System.out.println(newword);
		}
		else
		{
			String newword = rest + value + "ay";
			System.out.println(newword);
		}
		
//if (!word.equals("a")) pour faire la differnce
		

	}

}
