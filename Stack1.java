import java.util.Scanner;

public class Stack1{
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		Stack s1 = new Stack();
		
		int number;
		number=input.nextInt();
		s1.push(number);
		System.out.println(s1.pop());
		System.out.println(s1.countStack());
		System.out.println(s1.isEmpty());
	}
}

