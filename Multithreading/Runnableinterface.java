class Test implements Runnable
{
public void run()
{
System.out.println("Thread task 2 ");
}
public static void main(String[] args)
{
Test t = new Test();
Thread th = new Thread(t);
th.start();
}
}