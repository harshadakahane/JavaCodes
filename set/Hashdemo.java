import java.util.*;
class HashDemo
{public static void main(String [] args)
	{
		HashSet hs = new HashSet();

		hs.add("Amit");
		hs.add("Harshada");

		hs.add(new String("Amit"));
		hs.add(new String("Harshada"));

		System.out.println(hs);
	}
}

