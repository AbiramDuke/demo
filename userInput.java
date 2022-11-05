import java.util.Scanner;

public class userInput
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your number");//Get from user
		int number=sc.nextInt();//Assign the number into variable
		
		System.out.println("The number you have entered is "+ number);
	}
}