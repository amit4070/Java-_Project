package array;

public class M4 {
	public static void main(String[] args) {
		int [] a1 = {10,200,30,400,4,500,800,20,80,5,1,-3,8,230,900,45};
		//            0  1   2   3  4  5   6  7 8  9 10 11 12 13 14 15
	
		
	 // first half in reverse way	
		
		for (int i=(a1.length/2)-1;i>=0;i--)
		{
			System.out.print(a1[i]+",");
		}
		System.out.println();
		
	//	 second half in reverse way
		for (int i=a1.length-1;i>=a1.length/2;i--)
		{
			System.out.print(a1[i]+",");
		}
	}
}
