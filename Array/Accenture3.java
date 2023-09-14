import java.util.*;

class Demo
{
	public static int calculateFood(int r, int unit, int[] arr)
	{
		if(arr == null)
		{
			return -1;
		}
		int totalFood=0;
		for(int i=0; i<arr.length; i++)
		{
			totalFood += arr[i];
		}
		if(totalFood > r*unit)
		{
			return 0;
		}
		int foodPerRat =0;
		int houseIndex =0;
		while(r>0)
		{
			foodPerRat =0;
			while(foodPerRat <unit)
			{
				foodPerRat += arr[houseIndex];
				houseIndex++;
			}
			r--;
		}
		return houseIndex;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of r:");
		int r= sc.nextInt();
		System.out.println("Enter value of unit:");
		int unit = sc.nextInt();
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		System.out.println("Enter array elements:");
		int arr[] = new int[n];

		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Total amount of food required:");
		System.out.println(calculateFood(r, unit, arr));
	}


}
