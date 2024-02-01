class Test
{
int marks;
String name;

Void Test(int marks, String name)
{
this.marks = marks;
this.name = name;
}
public static void main(String[] args)
{
Test t1 = new Test(13, "Harsada");
Test t2 = new Test(16, "Sumit");
System.out.println(t1.marks+".."+t1.name);
System.out.println(t2.marks+".."+t2.name);


}

}
