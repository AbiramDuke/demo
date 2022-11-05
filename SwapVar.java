import java.util.Scanner;

public class SwapVar
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		
		int[] myVar = new int[2];
		
		for(int i=0;i<2;i++){
			System.out.println("Give a number : ");
			myVar[i]= input.nextInt();
		}
		
		System.out.println("Variables : " + myVar[0] + "\t"+myVar[1]);
		System.out.print("Swapped Variables : ");
		
		for(int i=1;i>=0;i--){
			System.out.print(myVar[i]+"\t");
		}
		
	}
}