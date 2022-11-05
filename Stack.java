 public class Stack{
	 int s[] = new int[100];
	 int tos;
	 
	 Stack(){
		 tos = -1;
	 }
	 
	 void push(int item){
		 if(tos==99) System.out.println("Stack is full");
		 else s[++tos]=item;
	 }
	 
	 int pop(){
		 if(tos>=0)
			return s[tos--];
		 else {
			 System.out.println("Stack is empty");
			 return -1;
		 }
	 }
	 
	 boolean isEmpty(){
		 return(tos<0);
	 }
	 
	 int countStack(){
		 return(tos+1);
	 }
	 
 }