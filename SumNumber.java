import java.util.Scanner;
public class SumNumber
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double Number;
		double Total=0;
		
		for(int i=0;i<5;i++){
			System.out.print("Enter the number : ");
			Number = input.nextDouble();
			if(Number>0)
			Total += Number;
		}
		
		System.out.println("The total of positive numbers : "+Total);
	}
}
		
		