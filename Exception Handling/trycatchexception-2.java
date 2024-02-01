class Test
{
public static void main(String[] args)
{
try
{
int a =100, b=2, c;
c=a/b;
System.out.println(c);
}
catch(Exception e)
{
System.out.println(e);
System.out.println("You cannot divide by zero");
}
}
}
