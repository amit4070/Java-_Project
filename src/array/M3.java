package array;
//reading first half of elements
public class M3 {
	public static void main(String[] args) {
		int [] a1 = {10,200,30,400,4,500,800,20,80,5,1,-3,8,230,900,45};
		//            0  1   2   3  4  5   6  7 8  9 10 11 12 13 14 15
	//	reading first half
	  for (int i=0;i<a1.length/2;i++)
		{
			System.out.print(a1[i]+",");
		}
		System.out.println();
		//reading second half*/
		
		for (int i=(a1.length/2);i<a1.length;i++)
		{
			System.out.print(a1[i]+",");
		}
		System.out.println();
	 // first half in reverse way	
		
		for (int i=a1.length/2;i>=0;i--)
		{
			System.out.print(a1[i]+",");
		}
		System.out.println();
		// second half in reverse way*/
		for (int i=a1.length-1;i>=a1.length/2;i--)
		{
			System.out.print(a1[i]+",");
		}
	}
}
