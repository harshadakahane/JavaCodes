class Test
{void show(Object a)
{
System.out.println("Object Method");

}
void show(String a)
{
System.out.println("String Method");
}
public static void main(String[] args)
{
Test t = new Test();
t.show("abc");
/*while resolvinf overload method compiler will always give precedence to child
 method argument than compared with the parent type 
 here object class is a parent class of string class in java */
}
}
