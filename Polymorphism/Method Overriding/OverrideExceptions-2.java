class Test
{
void show() throws RuntimeException
{
System.out.println("1");

}
}
class Xyz extends Test
{
void show() throws Exception // error only same exceptions are allowed here as parent class throw any exception
{
System.out.println("2");

}
public static void main(String[] args)
{
Test t = new Test();
t.show();
Xyz x = new Xyz();
x.show();
}
}
