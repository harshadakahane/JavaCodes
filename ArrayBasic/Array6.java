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

                int count =0;
		for(int i=0 ; i<n; i++)
		{
			if(arr[i] >= A && arr[i]<=B)
			{
				count++;
			}
		}

		//range chi size calculate karyala lagel krn applya tya range madhe pahije value
	        int rangeSize = B-A +1;

                
                System.out.println("Are values of A and B present in an array ?:");

		if(count == rangeSize)
		{
		System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}


