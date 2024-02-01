class Animal
{
void eat()
{
System.out.println("eating>>>>");
}
}
class Dog extends Animal{
void bark()
{
System.out.println("Barking......");
}
}
class Babydog extends Dog
{
void weep()
{
System.out.println("weeping....");
}
}

class Testinheritance2
{
public static void main(String[] args)
{
Babydog b = new Babydog();
b.weep();
b.bark();
b.eat();

}
}
