package array;
//array reverse
public class M12 {
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50, 60};
		              //   0  1    2   3  4    5
		
		System.out.println("initial array elements");
		for(int i = 0; i < elements.length; i++)
		{
			System.out.print(elements[i] + " , ");
		}
		//reversing
		for(int i = 0; i < (elements.length / 2); i++)
		{
			int temp = elements[i];
			elements[i] = elements[elements.length - 1 - i];
			elements[elements.length -1-i] = temp;
		}
		System.out.println("reversed array elements");
		for(int i = 0; i < elements.length; i++)
		{
			System.out.print(elements[i] + " , ");
		}
	}	
}
