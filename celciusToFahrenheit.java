import java.util.Scanner;
public class celciusToFahrenheit
{
	public static void main(String args[])
	{
		
		Scanner input=new Scanner(System.in);
		
		float celcius;
		float fahrenheit;
		
		System.out.print("Enter the temperature in Celcius : ");
		celcius = input.nextFloat();
		
		fahrenheit= ((celcius*9)/5)+32;
		
		System.out.print("Temperature in fahrenheit : " + fahrenheit);
		
	}
}