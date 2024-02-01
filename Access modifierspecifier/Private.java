class A
{
private int data=40;
private void msg()
{
System.out.println("Hello");

}
}
class simple
{
public static void main(String[] args)
{
 A a = new A();
 a.msg();

}
}
/* In this example, we have created two classes A and Simple. A class contains private data
member and private method. We are accessing these private members from outside the class,
so there is compile time error. */