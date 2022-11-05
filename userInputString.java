import java.util.Scanner;

public class userInputString
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your sentence here");
		String str= input.nextLine();
		
		System.out.println("Your sentence is "+str);
	}
}