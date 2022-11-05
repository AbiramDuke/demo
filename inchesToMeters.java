import java.util.Scanner;

public class inchesToMeters
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		double inches,meters;
		
		System.out.print("Enter the number of inches : ");
		inches = input.nextDouble();
		
		meters = inches/39.3701;
		
		System.out.print(inches+" inches is equals to "+meters+" meters");
		
	}
}