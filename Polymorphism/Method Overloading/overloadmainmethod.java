class Test
{
public void main(int a)
{
System.out.println("1");
}
public static void main(String[] args)
{
System.out.println("2");
Test t = new Test();
t.main(10);
}
}