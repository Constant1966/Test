package Lab4;
//Challenge 31
import java.util.Scanner;
public class Challenge31 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle:");
		int radius = user.nextInt();
		
		double area = Math.PI *(Math.pow(radius, 2));
		System.out.println(area);
		
	}

}
