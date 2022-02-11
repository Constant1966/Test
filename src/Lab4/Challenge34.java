package Lab4;
//Challenge 34
import java.util.Scanner;
public class Challenge34 {

	public static void main(String[] args) 
	{Scanner user = new Scanner(System.in);
		
	System.out.println("1) Square");
	System.out.println("2) Triangle\n");
	
	System.out.println("Enter a number:");
	int select = user.nextInt();
	
	switch(select)
	{
	case  1:
		System.out.println("Enter the length of one side:");
		int side = user.nextInt();
		
		int area = side * side;
		System.out.printf("The area of your chosen shape is %d", area);
		break;
		
	case 2:
		System.out.println("Enter the length of the base:");
		int base = user.nextInt();
		
		System.out.println("Enter the height of the triangle:");
		int height = user.nextInt();
		
		
		double area1 = (base * height) /2;
		System.out.println("The area of your chosen sape is "+ area1);
		break;
	default :
		{
			System.out.println("\nIncorrect option selected");
		}
	}
		
	}

}
