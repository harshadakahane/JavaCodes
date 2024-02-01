class Real
{
void Reel(String a)
{
System.out.println("Hii");
}
}
class Harshu extends Real
{ 
void Reel(String a)
{
System.out.println("2");
}
public static void main(String[] args)
{
Real r = new Real();
r.Reel("Haw");
Harshu as = new Harshu();
as.Reel("Good");
}
}
