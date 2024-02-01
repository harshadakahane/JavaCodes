class Real
{
void Reel(String a, int b)
{
System.out.println("Hii");
}
}
class Harshu extends Real
{ 
void Reel(String a, int b)
{
System.out.println("Overiding");
}
public static void main(String[] args)
{
Real r = new Real();
r.Reel("Haw", 5);
Harshu as = new Harshu();
as.Reel("Good",7);
}
}
