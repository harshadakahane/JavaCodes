import java.util.*;

class harshada
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array:");

		int n = sc.nextInt();

		if(n<=0)
		{
			System.out.println("Invalid input. The array size must be greater than 0.");
		return;
		}


		int[] arr = new int[n];

		System.out.println("Enter the elements in an array:");

		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();

		int max = arr[0];
		int min = arr[0];

		for(int i=1; i<=n; i++)
		{
			if(arr[i]<min)
			{
			min=arr[i];
			}
			if(arr[i]>max)
			{
			max=arr[i];
			}
		}

		System.out.println("Maximum element is "+max);
		System.out.println("Minimum element is "+min);
	}
}



