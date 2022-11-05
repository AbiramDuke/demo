import java.util.Scanner;

public class PalindromeQueue{
	 public static void checkPalindromeUsingQueue(String word) {
		Scanner input = new Scanner(System.in);
		
		String word = console.next();
        console.close();
		
        Queue q1 = new Queue(word.length());
        for (char letter : word.toCharArray()) {
            q1.enqueue(letter);
        }

        String reversed = "";
        while (!q1.isEmpty()) {
            reversed = q1.dequeue() + reversed;
        }

        if (word.equals(reversed))
            System.out.println(word + " is a palindrome using queue");
        else
            System.out.println(word + " is not a palindrome using queue");
    }
}