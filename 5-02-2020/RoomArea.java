class Room
{ 
  float l,b;
   void displayarea()
  { 
    System.out.println(l*b);
}
}
class RoomArea
{
  public static void main(String args[])
  {
    Room R=new Room();
    R.l=2;
    R.b=3;
    R.displayarea();
}}
