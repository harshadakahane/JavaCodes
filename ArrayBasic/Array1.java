import java.util.*;

class Arrayyy
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array:");

		int n = sc.nextInt();

	        int[] arr = new int[n];
		System.out.println("Enter elements in an array:");
	
			for(int i=0; i<n; i++)
			{
				arr[i] = sc.nextInt();
			}
		

                System.out.println("Enter element to be search:");
		int value = sc.nextInt();

		  for(int i=0; i<arr.length; i++)
		  {
			  if(arr[i] == value)
			  {
				  System.out.println("The index of element "+value+" is : "+i);
			  }
		  }
	}
}



