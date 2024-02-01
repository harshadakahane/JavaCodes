class Test extends Thread
{
public void run()
{
System.out.println("Task 1");
}
}

class Harsha extends Thread
{
public void run()
{
System.out.println("Task 2");
}
}

class Mythread
{
	
public static void main(String[] args)
{
Test t1 = new Test();
t1.start();

Harsha h = new Harsha();
h.start();
}
}