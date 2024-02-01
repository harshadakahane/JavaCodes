import java.io.FileInputStream;
class Test
{
public static void main(String[] args)
{
try
{
class.forName("com.mysql.jdbc.Drive");
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Hello");
}
}
