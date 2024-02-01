class Test
{
void show(int a)
{
System.out.println("int Method");

}
void show(int... a)
{
System.out.println("Varags Method");
}
public static void main(String[] args)
{
Test t = new Test();
t.show(10); //int
t.show(10,20,30);// varags
t.show(); //varags
}
/* 
varags allows the mehtod to accepts zero or multiple argumnets.
before varags either we use overload method or take an array as the method aparameter but it was not considered good 
becoz it leads to the argumnets we will have.
If we dont know how many argumnets we will have to pass in the
method,arrays is better approach.


In general, varags get least priority i.e if no other method , then only vrags method will getthe chance
becoz, int came in 1.0 version and varags in 1.5 version.
*/
}
}
