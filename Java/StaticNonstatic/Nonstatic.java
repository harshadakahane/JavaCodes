class Nonstatic
{
	// void fun1()  Error- Nonstatic method cannot be refrence from static context
	static void fun1()
	{
		System.out.println("A");
	}
	// void fun2()  Error- Nonstatic method cannot be refrence from static context
	static void fun2()
	{
		System.out.println("B");
	}
	public static void main(String[] args)
	{
		System.out.println("C");
		fun1();
		fun2();
	}
}
