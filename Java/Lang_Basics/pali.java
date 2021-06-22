import java.util.Scanner;

public class pali {
    public static void main(String[]args){
        String str= new String();
        int i=0,j=str.length()-1,k;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the word : ");
        s.nextLine();
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
              i++;
            j--;
             System.out.println("its palindrome");

            }
            else
            System.out.println("not palindrome");
        }
    }
    
}
