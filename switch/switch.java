import java.util.*;

class switchDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String fruit = sc.next();

		switch(fruit)
		{
			case "Mango":
				System.out.println("King of fruits");
				break;
			case "Orange":
				System.out.println("Khata mitha fruit");
				break;
			case "Grapes":
				System.out.println("Drink Daru");
				break;
			case "Appple":
				System.out.println("Red fruit");
				break;
			default:
				System.out.println("Please enter a valid fruit");
		}
	}
}


