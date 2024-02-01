class Student
{
int id;
String name;
int age;

Student(int i, String n)
{
id = i;
name = n;
}

Student(int i, String n, int a)
{
id=i;
name = n;
age = a;
}

void Display()
{
System.out.println(id+" "+name+" "+age);
}
public static void main(String[] args)
{
Student s1 = new Student(111, "Harshada");
Student s2 = new Student(112, "Amit", 22);

s1.Display();
s2.Display();
}
}