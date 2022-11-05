import java.util.Scanner;

public class PalindromeStackAndQueue{
	 public static void checkPalindromeUsingStackAndQueue(String word) {
		 
		Scanner input = new Scanner(System.in);
		
		String word = console.next();
        console.close();
		
        Stack s1 = new Stack(word.length());
        Queue q1 = new Queue(word.length());

        for (char letter : word.toCharArray()) {
            s1.push(letter);
            q1.enqueue(letter);
        }

        boolean isPalindrome = true;
        while (!q1.isEmpty() && !s1.isEmpty()) {
            if (s1.pop() != q1.dequeue()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println(word + " is a palindrome using stack and queue");
        else
            System.out.println(word + " is not a palindrome using stack and queue");
    }
}