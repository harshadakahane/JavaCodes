class Sound
{
private int increase;
private int decrease;

void setvolume()
{
   increase = 12;
}
void lowvolume()
{
 decrease = 8;
}
void volume()
{
System.out.println(increase);
System.out.println(decrease);
}

}

class ClassesandObject
{
public static void main(String[] args)
{

Sound s = new Sound();
s.setvolume();
s.lowvolume();
s.volume();
}

}
