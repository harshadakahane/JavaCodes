import java.util.*;

class Product
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array:");

		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the elemenst in an array:");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

		int product = arr[0];

		for(int i=1; i<n; i++)
		{
			product = product*arr[i];
		}
		System.out.println("Product of an array element is:"+product);

	}
}



