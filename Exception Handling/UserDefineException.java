class UserDefinedException extends Exception
{
public UserDefinedException(String str)
{
super(str);
}
}
class Testthrow3
{
public static void main(String[] args)
{
try
{
throw new UserDefinedException("This is User Defined Exception");
}
catch(UserDefinedException ude)
{

System.out.println("Caugt the Exception");
System.out.println(ude.getMessage());
}
}
}