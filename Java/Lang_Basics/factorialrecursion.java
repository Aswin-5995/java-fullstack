import java.util.*;
public class factorialrecursion{
    public static void main(String[]args){
        int i;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number : ");
    i=s.nextInt();
     System.out.println("factorial of " +i+ " is " +factorial(i));
     
    }
    private static int factorial(int i){
        if(i>0){ 
        return i*factorial(i-1);
        }
     else
        return 1;
    }
}