import java.util.*;
public class Leapyear {
    public static void main(String[]args){
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the year : ");
        i=s.nextInt();
        int m=i/4,j=4;
        if(j<=m){
            if(i%j==0){
                System.out.println("this is  a leap year : "+i);
            }else{
                System.out.println("this is not a leap year "+i);
            }
    }  
}
}
