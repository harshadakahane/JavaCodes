class TestThrow1
{
static void validate(int age)
{
if(age<18)
{
throw new ArithmeticException("Person not eligible to vote:");
}
else
{
System.out.println("Person eligible to vote");
}
}
public static void main(String[] args)
{
validate(17);
System.out.println("Rest of the code");
}
}