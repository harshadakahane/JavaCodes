import java.util.*;

class array
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array:");

	int n = sc.nextInt();

	int arr[] = new int[n];

	System.out.println("Enter the elements in an array:");

	for(int i=0; i<n; i++)
	{
		arr[i]=sc.nextInt();
	}
	sc.close();
	int max = arr[0];

	for(int i=1; i<n; i++)
	{
		if(arr[i]>max)
		{
			max = arr[i];
		}
	}

	System.out.println("Enter the largest elemnet in an array is:" +max);
	}
}

