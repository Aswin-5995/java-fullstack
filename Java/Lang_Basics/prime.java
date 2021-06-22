public class prime{
   public static void main(String[]args){
      
       for(int n=2;n<=50;n++){
          int m=n/2,i=2,k=0;
          for(i=2;i<=m;i++){
             if(n%i==0)
             {
                k=1;
                break;
             }
          }
          if(k==0)
             System.out.println(n+"is a prime number");
       }
   }
 }

