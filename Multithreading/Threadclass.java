class Harshaa extends Thread
{
public void run()
{
System.out.println("Thread task 1");
}
public static void main(String[] args)
{
Harshaa h = new Harshaa();
h.start();
}
}