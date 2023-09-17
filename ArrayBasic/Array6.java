import java.util.*;

class Range
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array:");

		int n = sc.nextInt();
                
		int arr[] = new int[n];

		System.out.println("Enter the elements in an array:");
		for(int i=0; i<n; i++)
		{
			arr[i] =sc.nextInt();
		}
                System.out.println("Enter the value of A:");

		int A = sc.nextInt();

		System.out.println("Enter the value of B:");
		int B = sc.nextInt();

		for(int i=A ; i<=B; i++)
		{
			if(arr[i] == A && arr[i]==B)
			{
				System.out.println("Yes");
			}

			else
			{
				System.out.println("No");
			}
		}
	}
}


