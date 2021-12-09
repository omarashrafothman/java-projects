import java.util.Scanner;
public class search
{ 
	public static void main(String[] args) { 
	 int arr[]={ 70,30,20,1,80,9}; 
	 int key; 
	 boolean flag = false; 
	 System.out.println("Guess a number"); 
	 Scanner scanner = new Scanner(System.in); 
	 key = scanner.nextInt(); 
	 for (int i=0; i<arr.length; i++) 
	 { 
		 if (key == arr[i]) 
		 { 
			 System.out.println("Item found at index "+ i); 
			 flag= true; 
		 } 
	 } 
	 if (flag== false) 
		 System.out.println("Item not found "); 
	   
	} 
   }

