class Test
{
void show()
{
System.out.println("Hekko");
}
void show(int a)
{
System.out.println(a);
}
public static void main(String[] args)
{
Test t = new Test();
t.show();
t.show(10);
}

}
