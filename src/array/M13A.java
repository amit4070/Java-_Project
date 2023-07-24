package array;

import java.util.Arrays;

public class M13A {
	public static void bubbleSort(int[] array)
	{
		int size = array.length;
		
		for(int i=0;i<size-1;i++)//access each array element
		{
			for(int j=0;j<size-i-1;j++)//loop for comparing elements
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];  //swapping
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
//				array[j] = array[j]+array[j+1];
//				array[j+1] = array[j]-array[j+1];
//				array[j] = array[j]-array[j+1];
			}
		}
	}
	public static void main(String[] args) {
		int[] array = {-2,45,0,11,9};
		//				0  1 2  3 4
		bubbleSort(array);
		System.out.print("final:" + Arrays.toString(array));
		System.out.println("----------------");
		for(int i:array)
		{
			System.out.print(i+" ");
		}
		System.out.println("----------------");
		for(int i=0;i<array.length-1;i++)
		{
			System.out.print(array[i] + " ");
		}
	}
}
