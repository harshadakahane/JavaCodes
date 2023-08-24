import java.util.ArrayList;
import java.util.*;
class demo
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();

		al.add(10);
		al.add("Harshada");
		al.add(10.5);

		System.out.println(al);


		System.out.println("Reading elements using Iterator method :");

		Iterator it = al.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

