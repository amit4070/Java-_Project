package array;
//prime or not using command line argument 
public class M11 {
	public static void main(String[] args) {
		
		if(args.length < 1)
		{
			System.out.println("please provide a number");
			return;
		}
		int num = Integer.parseInt(args[0]);
		boolean isPrime = true;
		 if(num <= 0 || num == 1)
		 {
			 System.out.println("pelase enter a number greater than");
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
			 System.out.println(num + "is a prime number");
		 }
		 else
		 {
			 System.out.println(num + "is not a prime number");
		 }	
	  }
}
