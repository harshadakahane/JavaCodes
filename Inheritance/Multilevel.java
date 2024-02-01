class Animal{
void eat()
{
System.out.printlb("eating....");
}
}
class Dog extends Animal{
void bark()
{
System.out.println("barking....");
}
}
class BabyDog extends Dog{
void weep()
{
	System.out.println("weeping..");

}
Class Test{
	public static void main(String[] args)
	{
		BabyDog b = new BabyDog();
		b.weep();
		b.bark();
		b.eat();
	}
}

