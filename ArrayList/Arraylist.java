import java.util.ArrayList;

class demo
{
	public static void main(String [] args)
	{
		ArrayList al = new ArrayList();

	        al.add(10);
		al.add("harshada");
		al.add(10.5);

		System.out.println(al);


		al.add(3,"collecton");

		System.out.println(al);

		System.out.println("Size of elements:");
		
		System.out.println(al.size());

		System.out.println(al.contains("harshada"));
	        System.out.println(al.contains("udh"));
		
		 System.out.println("using get method:");
		 System.out.println(al.get(3));
		  System.out.println(al);


		   System.out.println("using set method:");
		 System.out.println(al.set(2,"hello"));
		  System.out.println(al);


		    System.out.println("using addAll method:");

		    ArrayList al2 = new ArrayList();
		    al2.add("harshafa");
		    al2.add(12);
		    al2.add("hii");

		    al.addAll(al2);
		    System.out.println(al);
			    

}
}

			


