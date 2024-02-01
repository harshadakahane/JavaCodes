import java.io.*;
class Testthrow2
{
public static void method() throws FileNotFoundException
{
FileReader file = new FileReader("C://Users//Admin//Desktop//Aptitude//abc.txt");

BufferedReader fileInput = new BufferedReader(file);

throw new FileNotFoundException();
}


public static void main(String[] args)
{
try
{
method();
}
catch(FileNotFoundException e)
{
e.printStackTrace();
}
System.out.println("Rest of the code.......");
}

}