import java.util.Scanner;
public class RemoveChar
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter you sentence : ");
		
		String ModWord;
		String Word = input.nextLine();
		
		ModWord=Word.replace("a","");
		System.out.println(ModWord);
	}
}