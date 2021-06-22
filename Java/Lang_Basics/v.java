 import java.util.*;
 

public class v{
    public static void main(String[]args)
    { int n=5;
        Vector<String> v=new Vector<String>(n);
        v.add("aswin");
        v.add("mervyn");
       String str= v.get(1);
        v.remove(0);
        System.out.println(v);
        System.out.println(str);
      int m=  v.size();
        System.out.println(m);
        //v.indexOf("aswin");
        System.out.println(v.indexOf("mervyn"));
        v.clear();
        if(v.isEmpty())
        {
            System.out.println("good biee");
        }



    }
}