import java.util.*;

class demo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of n:");
		int n = sc.nextInt();
/*
 for(int i=1; i<=n; i++)
 {
 for(int j=1; j<=n-i+1; j++)
 {
 System.out.print(j);
 }
*/
		for(int i = n; i>=1; i--)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j+ "");
			}
			System.out.println();
		}
	}
}

