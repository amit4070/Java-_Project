package array;
//find out minimum no in array
public class M7 {
	public static void main(String[] args) {
	int [] a1 = {1,4,2,3,-9,0,2,-18,7};
	//           0 1 2 3  4 5 6  7  8  
	int min = a1[0];
	for (int i = 1;i<a1.length;i++)
	{
		if (a1[i]<min)
		{
			min = a1[i];
		}
	}
	System.out.println("min no is :"+ min);
	
 }
}
