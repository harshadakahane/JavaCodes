class Recursion
{
	public static int calcuFactorial(int n)
	{
		if(n == 1 || n == 0)
		{
			return 1;
		}

		int fact_cal = calcuFactorial(n-1);
		int fact_n = n * fact_cal;
		return fact_n;
	}
	public static void main(String[] args)
	{
		int n =5;
		int ans = calcuFactorial(n);
		System.out.println(ans);
	}
}
