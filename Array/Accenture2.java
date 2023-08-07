import java.util.Scanner;
class Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n = sc.nextInt();

		System.out.println("Enter value of m: ");
		int m = sc.nextInt();

		int sum =0;
		for(int i = n; i<=m; i++)
		{
			if((i%3==0) && (i%5==0))
				sum = sum + i;
		}
		System.out.println("Sum of divisible number by 3 and 5 are : " + sum);

	}
}


