import java.util.ArrayList;

class demo
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();

		al.add(10);
		al.add("harshada");
		al.add("amit");
		al.add(12);

		System.out.println("Number of elements in the ArrayList:");

		System.out.println(al);


		System.out.println("ArrayList using for loop");
		for(int i=0; i<=al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println(al);
	}
}







