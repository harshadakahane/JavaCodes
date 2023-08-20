import java.util.*;

class demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value of n:");
                int n = sc.nextInt();
                 
		System.out.println("Enter value of m: ");
		int m = sc.nextInt();


		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=m; j++)
			{
				
				{
					System.out.print(j + " " + i + " ");
				}
			
			}
			
			System.out.println();
		}
	}
}



