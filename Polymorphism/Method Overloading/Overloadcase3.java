class Test
{void show(StringBuffer a)
{
System.out.println("StringBuffer Method");

}
void show(String a)
{
System.out.println("String Method");
}
public static void main(String[] args)
{
Test t = new Test();
t.show("abc"); //String Method
t.show(new StringBuffer("xyz")); //StringBuffere
t.show(null); //error: reference to show is ambiguous
}
}
