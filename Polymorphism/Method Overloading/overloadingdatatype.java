class Test
{
void show(int a)
{
System.out.println(a);
}
void show(String a)
{
System.out.println(a);
}
public static void main(String[] args)
{
Test t = new Test();
t.show("hi");
}
}

