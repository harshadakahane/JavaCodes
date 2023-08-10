import java.util.*;
class EnchanceSwitchDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String fruit = sc.next();

		switch(fruit)
		{
			case "Mango":-> System.out.println("Kings of fruits");
			case "Apple":-> System.out.println("A sweet red fruit");
			case "Orange":->System.out.println("Round fruit");
			case "Grapes":->System.out.println("Small fruit");
			default:-> System.out.println("Please enter a valid fruit");
		}

	}
}

