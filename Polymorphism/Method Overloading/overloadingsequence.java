class Book
{
void Tickets(String name , int id)
{
System.out.println(name+" "+id);
}
void Tickets(int time, String movie)
{
System.out.println(time+ " " +movie);
}
public static void main(String[] args)
{
Book b = new Book();
b.Tickets("Harshada", 101);
b.Tickets(2,"Jawaan");
}
}
