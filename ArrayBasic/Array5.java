import java.util.*;

class Array
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter the value of N :");

		int N = sc.nextInt();

	//	System.out.println("Enter the value to be replaced:");
	//	int value = sc.nextInt();

		String ans = String.valueOf(N).replace("0", "5");

		System.out.println("Output:"+ ans);
	}
	
}

