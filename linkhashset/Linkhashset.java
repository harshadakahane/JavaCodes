import java.util.*;

class Cricplayer
{
	int jerNo=0;
	String pName = null;

	Cricplayer(int jerNo, String pName)
	{
		this.jerNo = jerNo;
		this.pName = pName;
		
	}
}
class HashSetDemo
{
	public static void main(String[] args)
	{
		LinkedHashSet hs = new LinkedHashSet();

		hs.add(new Cricplayer(10, "virat"));
		hs.add(new Cricplayer(7, "Dhoni"));
		hs.add(new Cricplayer(45, "Rohit"));
		hs.add(new Cricplayer(7, "Dhoni"));

		System.out.println(hs);
	}
	
}

