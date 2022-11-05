import java.util.Scanner;

public class Multiplication
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		for(int i=1; i<=10;i++){
			System.out.println( i +" * "+ number +" = "+ (i*number));
		}
	}
}