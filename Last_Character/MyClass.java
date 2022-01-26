import java.util.Scanner;
public class MyClass{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        in.close();
        str=str.toLowerCase();
        for(int i=0;i<str.length()-1;i++)
        {
            if(Character.isWhitespace(str.charAt(i+1)))
            {
                if(str.charAt(i)>='a'&&str.charAt(i)<='z')
                  System.out.print(str.charAt(i));
            }
        }
        if(!Character.isDigit(str.charAt(str.length()-1)))
         System.out.print(str.charAt(str.length()-1));
    }
}