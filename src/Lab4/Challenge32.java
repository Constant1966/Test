package Lab4;
//Challenge 32
import java.util.Scanner;
import java.text.DecimalFormat;
public class Challenge32 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("###.###");
		
		System.out.println("Enter the radius of the circle:");
		int radius = user.nextInt();
		
		System.out.println("Enter depth:");
		int depth = user.nextInt();
		
		double area = Math.PI *(Math.pow(radius, 2));
		double volume = area * depth;
		
		System.out.println(deci.format(volume));
		
		
	}

}
