import java.util.ArrayList;

class demo
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();

		al.add("harshada");
		al.add(10);
		al.add("hello");
		al.add(10.5);

		System.out.println("Elements in a Arraylist are:");
		System.out.println(al);

		System.out.println("ArrayList using for each loop:");

		for(Object value : al)
		{
			System.out.println(al);
		}
	}
}


