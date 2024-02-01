class MyThread1 extends Thread
{
public void run()
{
System.out.println("Thread task");
}
}
class Test
{
public static void main(String[] args)
{
MyThread1 thread1 = new MyThread1();
thread1.start();
}
}
