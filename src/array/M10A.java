package array;
//prime no 
import java.util.Scanner;

public class M10A {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number..\n");
		 int i = sc.nextInt();
		 
		 boolean isPrime = true;
		 
		 for(int j=2;j<=(i / 2); j++)
		 {
			if(i%2==0) 
			{
				isPrime = false;
				break;
			}
		 }
       System.out.println(i +" is "+(isPrime ? "Prime no":"Not Prime No"));
	}
}
