import java.util.*;

class demo
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("y");
		al.add("z");
		al.add("a");
		al.add("b");
		al.add("c");
                System.out.println(al);

		System.out.println("Add all elemnts in another arraylist:");

		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);

		System.out.println(al_dup);
                
		System.out.println("Remove all elements using removeAll:");

		al_dup.removeAll(al);
		System.out.println(al_dup);

		//sorting
		Collections.sort(al);
		System.out.println("Elemnets in the arraylist after sorting :"+al);

		//sorting in reverse oder
		 Collections.sort(al, Collections.reverseOrder());
		 System.out.println("Elemnets in the arraylist after reverse sorting :"+al);

		 //shuffling
		 Collections.shuffle(al);    
	          System.out.println("Elemnets in the arraylist after shuffling :"+al);




	}
}


