package Lab4;
//Challenge 30
import java.text.DecimalFormat;
public class Challenge30 {

	public static void main(String[] args) 
	{
		DecimalFormat deci = new DecimalFormat("###. #####");
		System.out.println(deci.format(Math.PI));
	}

}
