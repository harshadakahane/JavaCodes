import java.util.*;

class demo
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value of n :");

		int n = sc.nextInt();
                //first half
		for(int i=1; i<=n; i++)
		{
			//spaces
			for(int j =1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
                       
		        for(int j=i; j>=1; j--)
			{
				System.out.print(j);
			}
			for(int j=2; j<=i; j++)
			{
				System.out.print(j);
			}

			System.out.println();
		}
	}
}


