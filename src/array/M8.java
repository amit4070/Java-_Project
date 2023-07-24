package array;
//find out maximum no in array
public class M8 {
	public static void main(String[] args) {
		int [] a1 = {1,4,2,3,-9,0,2,-18,7};
		//           0 1 2 3  4 5 6  7  8  
		int max = a1[0];
		for(int i=1;i<a1.length;i++)
		{
			if(a1[i] > max)
			{
				max = a1[i];
			}
		}
		System.out.println("max no is:"+max);
	}
}
