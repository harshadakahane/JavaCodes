import java.util.*;

class Cricplayer
{
	int jerNo =0;
	String name = null;

	Cricplayer(int jerNo, String name)
	{
		this.jerNo = jerNo;
		this.name = name;
	}
         public String toString()
	{
	//	return name;
	return jerNo + " : " +name;	
	}

}
class Arraylistdemo
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(new Cricplayer(18,"virat"));
                al.add(new Cricplayer(7,"Dhooni"));
		al.add(new Cricplayer(45,"Rohit"));

		System.out.println(al);
	}
}

