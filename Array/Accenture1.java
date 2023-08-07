import java.util.Scanner;
import java.util.Arrays;
	
class Arraydemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");

		int size = sc.nextInt();

		int[] arr = new int[size];

		int[] even = new int[size/2 + 1];

		int [] odd = new int[size/2];

		int evenIndex=0;
		int oddIndex=0;

		for(int i =0; i<size; i++)
		{
			arr[i] = sc.nextInt();
			if(i%2==0)
			{
				even[evenIndex++] = arr[i];
			}
			else
			{
				odd[oddIndex++] = arr[i];
			}
		}

		Arrays.sort(even);
		Arrays.sort(odd);
	       System.out.println ("Sorted even array: ");
	       for (int i =0; i<even.length; i++)
	       {
		       System.out.print (even[i] + " ");
	       }
	             System.out.println ();

	       System.out.println ("sorted odd array: ");
		    for (int i=0; i<odd.length; i++)
		    {
			          System.out.print(odd[i] + " ");
				  }
		        System.out.println ();

		int sum = even[even.length -2] + odd[odd.length -2];
		System.out.println("Sum of second largest number from both matrices: " + sum);
	}
}

