class Demo
{
int x,y;
Demo(int p, int q)
{
x=p;
y=q;

System.out.println(x);
System.out.println(y);
}
Demo(int f)
{
	System.out.println(f);
}
Demo()
{
	System.out.println();
}

}
class Construct {
public static void main(String [] args)
{
Demo d1 = new Demo(5,6);
Demo d2 = new Demo();
Demo d3 = new Demo(6);
}
}
