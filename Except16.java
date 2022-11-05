import java.util.Scanner;
public class Except16
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Case 1\n_________\n");
		
		for(int i=10; i<=20;i+=2){
				if(i ==16)continue;
				System.out.println(i);
		}
		
		System.out.println("\n\nCase 2\n_________\n");
		
		for(int i=10; i<=20;i++){
			if(i%2==0){
				if(i ==16)continue;
				System.out.println(i);
			}
		}
		
		System.out.println("\n\nCase 3\n_________\n");
		
		int Number=8;
		
		while(true){
			if(Number>=20){
				break;
			}
			Number+=2;
			if(Number==16)continue;
				System.out.println(Number);
			
			
		}
	}
}
		
		 