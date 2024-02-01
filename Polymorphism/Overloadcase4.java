class Test
{
void show(int a,float b)
{
System.out.println("int float Method");

}
void show(float a, int b)
{
System.out.println("float int method");
}
public static void main(String[] args)
{
Test t = new Test();
t.show(10,20.5f); //String Method
t.show(20.5f, 20); //StringBuffere
t.show("abc", 20.5f); //no suitable method found for show(String,float)

t.show(10,20); //error: reference to show is ambiguous
}
}