import java.util.*;

class Rearrange
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n =sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the elements in an elements:");
		for(int i=0; i<n; i++)
		{
		arr[i]=sc.nextInt();
		}

		Arrays.sort(arr);
		
		String largestNumber=""; // store largest no as string
		for(int i=n-1; i>=0; i--)
		{
			largestNumber += arr[i];
		}

		System.out.println("The largest number formed is: " +largestNumber);
	}
}



		
