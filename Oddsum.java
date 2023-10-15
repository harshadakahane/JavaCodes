import java.util.*;
class demo
{
	public static void main(String[] args)
	{

	int sum=0;
	int n =10;
	for(int i=0; i<=n; i++)
	{
		if(i % 2!=0)
		{
			sum = sum + i;
		}

	}
	System.out.println("sum of odd no is:"+sum);
}

}

