import java.util.*;
class Demo
{
	public static  int OperationChoices(int c, int a, int b)
	{
		int n =0;
		switch(c)
		{
			case 1: n = a+b;
				break;
			case 2: n = a - b;
				break;
			case 3: n = a*b;
				break;
			case 4: n = a/b;
				break;
		}
		return n;
	}
public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
	
	System.out.println(OperationChoices (c,a,b));
	}
}
