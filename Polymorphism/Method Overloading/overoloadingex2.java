class Add
{
public int sum(int x , int y)
{
System.out.println("sum of numbers is :" +(x+y));
return x + y;

}
public int sum(int x, int y, int z)
{
System.out.println("sum of numbers is :" +(x+y+z));
return x+y+z;

}
public static void main(String[] args)
{
Add a = new Add();
a.sum(10,20);
a.sum(10,20,30);
}

}
