import java.util.Scanner;

public class PalindromeStack{
	public static void checkPalindromeUsingStack(String word) {
	 
		Scanner input = new Scanner(System.in);
		
		String word = console.next();
        console.close();
		
        Stack s1 = new Stack(word.length());

        for (char letter : word.toCharArray()) {
            s1.push(letter);
        }

        int index = 0;
        boolean isPalindrome = true;
        while (!s1.isEmpty()) {
            if (word.charAt(index++) != s1.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println(word + " is a palindrome using stack");
        else
            System.out.println(word + " is not a palindrome using stack");
	}
 }