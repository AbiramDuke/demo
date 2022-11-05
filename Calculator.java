import java.util.Scanner;
public class Calculator
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double Number1,Number2,Answer;
		char Operator;
		
		System.out.print("Enter the Number1 : ");
		Number1= input.nextDouble();
		System.out.print("Operation want to do : ");
		Operator = input.next().charAt(0);
		System.out.print("Enter the Number2 : ");
		Number2 = input.nextDouble();
		
		switch (Operator){
			case '+' : 
			System.out.print(Number1 +" + "+Number2+" = "+(Number1+Number2));
			break;
			
			case '-' : 
			System.out.print(Number1 +" - "+Number2+" = "+(Number1-Number2));
			break;
			
			case '*' : 
			System.out.print(Number1 +" * "+Number2+" = "+(Number1*Number2));
			break;
			
			case '/' : 
			System.out.print(Number1 +" / "+Number2+" = "+(Number1/Number2));
			break;
		}
	}
}
			