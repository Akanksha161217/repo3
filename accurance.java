import java.util.*;
class Test
{
	public static void main(String args[])
	{
		int arr[]={12,13,11,15,55,11,12,12,15,55,55,55};
		int n=arr.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int el=sc.nextInt();
		int i,k;
		k=0;
		for(i=0;i<n;i++)
		{
			if(arr[i]==el)
			k++;
		}
		System.out.println("Occurence="+k);
	}
}