import java.util.Scanner;

public class PalindrometestStack{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		CharStack s1 = new CharStack();
		CharStack s2 = new CharStack();
		CharStack s3 = new CharStack();
		
		System.out.print("Your word here : ");
		String word;
		
		word = input.nextLine();
		
		int lettercount= word.length();
		
		for(int i=0;i<=lettercount-1;i++){
			System.out.println(word.charAt(i));
			s1.push(word.charAt(i));
			s2.push(word.charAt(i));
		}
		
		for(int i=lettercount-1;i>=0;i--){
			s3.push(s2.pop());
		}
		
		if(s1.equals (s3)) System.out.println(word+" is a palindrome word");
		else System.out.println(word+" is not a palindrome word");
	}
}