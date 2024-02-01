class Emplyoee extends Thread
{
public void run()
{
if(Thread.currentThread().isDaemon())
{
System.out.println("Daemon Thread");
}
else
{
	System.out.println("Child Thread");
}
}
public static void main(String[] args)
{

Emplyoee e = new Emplyoee();
e.setDaemon(true);
e.start();
}
}