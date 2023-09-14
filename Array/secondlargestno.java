import java.util.*;

class harshada
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of an array:");

		int n = sc.nextInt();

		int[] arr = new int[n];
		

		System.out.println("Enter the elements in an array:");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp;

		for(int i =0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second largest element in an array is:"+arr[1]);
	}
}


