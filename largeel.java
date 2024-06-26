import java.util.*;
class Test
{
	public static void main(String args[])
	{
		int arr[]={12,13,11,15,55};
		int n=arr.length;
		int max=arr[0];
		{
			for(int i=0;i<n;i++)
			{
	
				 if (arr[i] > max) 
               			 max = arr[i]; 
			}
			System.out.println("Largest number is" + max);
		}
	}
}
