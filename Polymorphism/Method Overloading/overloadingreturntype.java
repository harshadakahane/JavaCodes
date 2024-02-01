class Test
{
void show(int a)
{
System.out.println(a);
}
String show(int a) // return type here is string
{
System.out.println(a);
}
public static void main(String[] args)
{
Test t = new Test();
t.show(10);
}
}
