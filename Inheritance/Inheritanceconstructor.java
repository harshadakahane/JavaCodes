class Nokia1 
{
int x, y;
Nokia1()
{
System.out.println("Parent's constructor exexcuted");
}
void f1()
{
System.out.println("Parent function 1 executed");
}
void f2()
{
System.out.println("Parent function 2 executed");
}

}
class Nokia2 extends Nokia1
{
int z;
void f3()
{
System.out.println("child function 1 executed");
}
Nokia2()
{
System.out.println("child constructor executed");
}
}
class Inherit
{
public static void main(String[] args)
{
Nokia2 n1 = new Nokia2();

}
}
