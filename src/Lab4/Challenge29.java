package Lab4;
//Challenge 29
import java.text.DecimalFormat;
import java.util.Scanner;

public class Challenge29 {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		DecimalFormat val = new DecimalFormat("###. ##");
		
		System.out.println("Enter a number over 500:");
		int num = user.nextInt();
		
		double answer = Math.sqrt(num);
		System.out.println(val.format(answer));
	}

}
