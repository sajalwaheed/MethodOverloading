class Addition 
{
  int x,y;
 void add (int a,int b)
 {
 x=a;
 y=b;
 System.out.println("x+y="+(x+y));
 }
 void add(int a,int b, int c)
{ 
 x=a;
 y=b;
 z=c;
 System.out.println("x+y+z="+(x+y+z));
}
}
public class Lab7MethodOverloading
{
public static void main( String args[])
{
 Addition P =new Addition();
P.add(10,20);
P.add (60,40,30);
}
}
