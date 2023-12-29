class Harshada
{
String x;
private int y;
void fun1()
{
	System.out.println("yeda Amit");
}
void fun2()
{
	System.out.println("I love You");
	
}
}

class object1
{
	public static void main(String[] args)
	{
		Harshada H1= new Harshada();
		Harshada H2= new Harshada();
		H1.x="Oye";
		H2.y=23;
		System.out.println(H1.x);
		System.out.println(H2.y);
		H1.fun2();
	}
	
}
