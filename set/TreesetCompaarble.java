import java.util.*;

class Myclass implements Comparable
{
	String str = null;
	Myclass(String str)
	{
		this.str = str;
	}
	public int compareTo(Object obj)
	{
		return 1;
	}
	public String toString()
	{
		return str;
	}
}	class TreeSetdemo
	{
		public static void main(String[] args)
		{
			TreeSet ts = new TreeSet();

			ts.add(new Myclass("harshada"));
			ts.add(new Myclass("amit"));
			ts.add(new Myclass("sumit"));
			ts.add(new Myclass("shiv"));
			

			System.out.println(ts);
		}
		
	}



