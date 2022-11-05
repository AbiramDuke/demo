import java.util.Scanner;

public class SwapString
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the word : ");
		String myWord = input.next();
		
		int len = myWord.length();
		
		char arrayS[]=myWord.toCharArray();
		
		for(int i=len-1;i>=0;i--){
			System.out.print(arrayS[i]+" ");
		}
	}
}
			