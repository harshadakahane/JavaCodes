class Hero extends Thread
{
public void run()
{
System.out.println("Child thread");
System.out.println("Child thread priority:" +Thread.currentThread().getPriority());
}
public static void main(String[] args)
{
System.out.println("Main thread old priority:" +Thread.currentThread().getPriority());
Thread.currentThread().setPriority(10);
System.out.println("Main thread new priority:" +Thread.currentThread().getPriority());

Hero h = new Hero();
h.setPriority(5);
h.start();
}
}
