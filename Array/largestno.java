import java.util.*;
class harshada
{
	public static void main(String[] args)
	{
	        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");

		int n = sc.nextInt();


		int[] arr = new int[n];
		System.out.println("Enter element in array:");

		for(int i=0; i<n; i++)

		{
			arr[i] =sc.nextInt();
		}


		int largest = arr[0];

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] >largest)
				largest = arr[i];
		}
		System.out.println("Largest element in an array is:" +largest);
	}
}


