public class sbuf {
    public static void main(String[]args)
    {
        StringBuffer s= new StringBuffer();
        s.append("abcdefg");
        s.append("hijklmnop");
        s.append("qrstuvwxyz");
        s.append(123);
        System.out.println(s.toString());
        
        int i=12,j=0;
        float f1;
        try{
             f1=i/j;
            System.out.println(f1);

        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        
    }
    
}
