package mypack;
import pack.*;
class B
{
public static void main(String[] args)
{
A obj = new A();
obj.msg();
}

}
/* In the above example, the scope of class A and its method msg() is default so it cannot be
accessed from outside thepackage.
*/