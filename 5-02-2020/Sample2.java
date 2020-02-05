class Sample1
{ 
   void area(int a, int b)
  { 
    System.out.println(a*b);
}
 void area()
{ 
  int x=2;
  int y=3;
  System.out.println(x+y);
}}
class Sample2
{
  public static void main(String args[])
  {
    System.out.println(" product = ");
    Sample1 R=new Sample1();  
    R.area();
    System.out.println(" sum = ");
    R.area(2,3);
}}
