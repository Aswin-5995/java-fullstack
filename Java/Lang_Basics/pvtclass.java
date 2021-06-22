public class pvtclass {
    public static void main(String[]args)
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
        sub s= new sub();
        s.adding();
        mu m= new mu();
        m.multiplication();
        div d= new div();
        d.division();
    }
   
    
}

class sub{
    int a=5;
    int b=3;
    int c;
    public void adding(){
         this.c=this.a+this.b;
        System.out.println(c);
    }
    

}

class mu{
    int a=5;
    int b=3;
    int c;
    public void multiplication(){
        this.c=this.a*this.b;
    System.out.println(c);
    }
}

class div{
    int a=5;
    int b=3;
    int c;
    public void division(){
    c=a/b;
    System.out.println(c);
    }
}
