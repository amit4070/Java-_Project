package array;
//sorting an Aarry
public class M9 {
	public static void main(String[] args) {
		int x[] = {20,50,10,30,40,1};
		
		for(int j=0;j<x.length-1;j++)
		{
			for(int i=0;i<x.length-1;i++)
			{
				if(x[i]>x[i+1])
				{
					int temp = x[i];
					x[i] = x[i+1];
					x[i+1] = temp;
				}
			}
		}
		for(int i : x)
		{
			System.out.println(i);
		}
	}
}
