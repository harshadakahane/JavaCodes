class ThreadDemo
{
public static void main(String[] args)
{
System.out.println("Hello");
System.out.println("Current thread name is: " +Thread.currentThread().getName());
Thread.currentThread().setName("Harshada");
System.out.println("Changing thread name is :" +Thread.currentThread().getName());

}
}