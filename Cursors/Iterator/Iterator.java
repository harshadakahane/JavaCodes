import  java.util.Iterator;
import java.util.ArrayList;

class demo
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("Harshada");
		al.add("Amit");
		al.add("Shivani");

		Iterator itr = al.iterator();

		while(itr.hasNext())
		{
			if("Rahul".equals(itr.next()));
					itr.remove();

			System.out.println(itr.next());

		}
		System.out.println(al);
	}
}

