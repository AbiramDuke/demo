import java.util.Scanner;
import java.lang.Math;

public class integerCharacters
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your numbers\nnumber1 : ");
		int number1 = input.nextInt();
		
		System.out.print("number2 : ");
		int number2 = input.nextInt();
		
		int sum = number1+ number2;
		int difference = number2 - number1;
		int product = number1* number2;
		double average = (number1+number2) /2.0;
		int distance = Math.abs(difference);
		
		System.out.println("The Sum of numbers : = "+sum);
		System.out.println("The Difference of numbers = "+difference);
		System.out.println("The product of numbers = "+product);
		System.out.println("The Average of numbers = "+average);
		System.out.println("The Distance of numbers = "+distance);
	}
}