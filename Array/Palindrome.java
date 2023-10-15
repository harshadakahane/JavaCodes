import java.util.*;
class palin
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		int temp = number;
		int num=0;
		int digit =0;
		while(temp>0)
		{
			digit = temp%10;
			num = num*10 +digit;
		       	temp=temp/10;
		}
		 System.out.println(num);
		if(number==num)
		{
			System.out.println("Its is a palindrome number ");
		}
		else
		{
			System.out.println("Not a palindrome number ");
		}

		
	}
}



