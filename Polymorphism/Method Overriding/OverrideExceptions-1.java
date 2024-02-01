class Test
{
void show()
{
System.out.println("1");

}
}
class Xyz extends Test
{
void show() throws Exception // error only uncked exceptions are allowed here as parent class oesnt throw any exception
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
