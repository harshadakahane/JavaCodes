import java.util.ArrayList;
import java.util.Scanner;
class Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list= new ArrayList<Integer>();
		
	list.add(10);
	list.add(20);
	list.add(16560);
        list.add(1033);
        list.add(1023);

	System.out.println(list);

	System.out.println(list.contains(20));

	//input
	for(int i=0; i<5; i++)
	{
		list.add(sc.nextInt());

	}
	//get item at any index 
	for(int i =0; i<5; i++)
	{
		System.out.println(list.get(i));
	}

	System.out.println(list);
	}

}

