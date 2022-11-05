import java.util.Scanner;

public class CircleChar
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the radius os circle : ");
		double radius = input.nextDouble();
		
		System.out.println("The Area of the circle = " + radius*radius*22/7);
		System.out.println("The Circumtance of the circle = " + 2*radius*22/7);
	}
}