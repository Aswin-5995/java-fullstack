
import java.util.*;
public class palirev {
    public static void main(String[]args){
        String str1,str2;
        str1="madam";
      int n=str1.length();
      str2="";
        for(int i=n;i>=n;i--){
            str1 = str1+str2.charAt(n-i);
        }
        if(str1.equals(str2)){
            System.out.println("it is a plaindrome");
        }
        else
          System.out.println("it is not  a palindrome");

  
}
}
