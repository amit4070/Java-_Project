package array;
//prime no
import java.util.Scanner;

public class M10 {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the number..\n");
	 int num = sc.nextInt();
	 
	 boolean isPrime = true;
	 if(num <= 0 || num == 1)
	 {
		 System.out.println("please enter a number greater than");
		 return;
	 }
	 
	 for(int i = 2; i <= (num / 2); i++)
	 {
		 if(num % i == 0)
		 {
			 isPrime = false;
			 break;
		 }
	 }
	 if(isPrime)
	 {
		 System.out.println(num + " is a prime number");
	 }
	 else
	 {
		 System.out.println(num + " is not a prime number");
	 }	
   }
}
