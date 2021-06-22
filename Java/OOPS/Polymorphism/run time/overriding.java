public class overriding {
    public static void main(String[]args)
    {
       justice j;
       j=new superman();
       j.beep();
       j=new aquaman();
       j.beep();
    
    }
    
}
class justice
{   
    void beep()
   {
    System.out.println("batman");
    }
}
class superman extends justice
{
    void beep()

 {
    System.out.println("aquaman");
  
 }
}
 class  aquaman extends justice
{
    void beep()
 
 {
    System.out.println("wonder woman");

 }
}
