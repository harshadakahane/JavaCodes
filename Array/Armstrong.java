import java.util.*;

class Armstrong
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number u want to: ");
		int n = sc.nextInt();

		int arm=0;
		int rem, c;
		c=n;


		while(n>0)
		{
			rem=n%10;
			arm = (rem*rem*rem)+ arm;
			n=n/10;


		}
		if(c==arm)
		{
			System.out.println("It is a armstrong number:");
		}
		else
		{
			System.out.println("Not a armstrong number:");
		}
	}
}

