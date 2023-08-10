import java.util.*;
class Nestedswitchdemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int EmpId = sc.nextInt();

		String department = sc.next();

		switch(EmpId)
		{
			case 1:
				System.out.println("Harshada kahane");
				break;
			case 2:
				System.out.println("Amit Khartode");
				break;
			case 3:
				System.out.println("Emp Number 3");
				switch(department)
				{
					case "IT":
						System.out.println("IT department");
						break;
					case "Mangement":
						System.out.println("Management Deaprtment");
						break;
					default:
						System.out.println("No department entered");
				}
				break;
			default:
				System.out.println("Enter correct EmpID");
		}
	}

}

