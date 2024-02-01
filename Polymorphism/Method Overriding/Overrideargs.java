class Real
{
void Reel()
{
System.out.println("1");
}
}
class Harshu extends Real
{ 
void Reel()
{
System.out.println("2");
}
public static void main(String[] args)
{
Real r = new Real();
r.Reel();
Harshu as = new Harshu();
as.Reel();
}
}
