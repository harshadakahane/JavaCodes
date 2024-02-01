interface I1
{
void display1();
}
abstract class Test
{
abstract void display();
void show()
{
System.out.println("1");

}
}
class Xyz implements I1
{
public void display1()
{
}

void show() 
{
System.out.println("2");

}
public static void main(String[] args)
{
// Test t = new Test();
// t.show();
Xyz x = new Xyz();
x.show();
}
}
