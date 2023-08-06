import java.util.*;
class Iterativearray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[4][4];
		System.out.println(arr.length);

		for(int i =0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		for(int[] a : arr)
		{
			System.out.println(Arrays.toString(a));
		}
	}
}

