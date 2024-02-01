class Test extends Thread
{
public void run()
{
// Thread.yield();
for(int i=1; i<=5; i++)
{
System.out.println(Thread.currentThread().getName()+ ":" +i);
}
}

public static void main(String[] args)
{
Test t = new Test();
t.start();

Thread.yield(); //if you want main method to stop and provide chance to another method
for(int i =1; i<=5; i++)
{
System.out.println(Thread.currentThread().getName()+ ":" +i);
}
}


}
