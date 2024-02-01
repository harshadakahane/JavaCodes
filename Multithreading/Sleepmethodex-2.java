class Test extends Thread
{
public void run()
{
for(int i =1; i<=20; i++)
{
try
{
Thread.sleep(2000);
System.out.println(i);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
public static void main(String[] args)
{
Test t = new Test();
t.start();
}
}

