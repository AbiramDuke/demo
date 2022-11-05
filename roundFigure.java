import java.lang.Math;
import java.util.Scanner;

public class roundFigure
	{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your number : ");
		float number = input.nextFloat();
		
		System.out.print("The closest integer is "+ Math.round(number));
		
	}
}
		
		