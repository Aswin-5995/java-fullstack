public class fibonacci {
    public static void main(String[]args){
        int a,b,c;
        a=0;
        b=1;
      System.out.println(a+"\n"+b);
       
        for(int i=1;i<=100;i++){
            c=a+b;
           // if(c>=50)
            System.out.println(c);
        a=b;
        b=c;

     
        }
       
        }

    }
    

