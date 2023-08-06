import java.util.*;
class Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][3];
		System.out.println(arr.length);

		for(int i = 0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
	
		}
		for(int i =0; i<arr.length; i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}

