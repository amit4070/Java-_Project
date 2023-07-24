package array;

//Bubble Sort
public class M13 {
	public static void main(String[] args) {

		int x[] = {20,50,30,1,5,3};
		 //			0  1  2 3 4 5
		for(int j=0;j<x.length-1;j++)
		{
			for(int i=0;i<x.length-1;i++)
			{
				if( x[i] > x[i+1] );
				{
					int temp = x[i];
					x[i] = x[i+1];
					x[i+1] = temp;
				}
			}
		}
		for (int i : x)
		{
			System.out.println(i);
		}
 	}
}
/*
 * Bubble sort -simple sorting algorithm,that works by repeatedly swapping
 * adjacent elements in case if they are in random order.
 * 
 */