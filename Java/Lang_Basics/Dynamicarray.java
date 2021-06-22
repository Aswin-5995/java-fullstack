import java.util.*;
public class Dynamicarray {
    public static void main(String[]args){
        int a[]=new int[100];
        int i;
        Scanner s= new Scanner(System.in);
        System.out.println("the number array of : ");
        i=s.nextInt();
        for(int j=0;j<i;j++){
            System.out.println("array of " +j+" : ");
            a[j]=s.nextInt();
        }

        for(int j=0;j<i;j++){
             System.out.println(a[j]);
        }
       
    }
    
}
