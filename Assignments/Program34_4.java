import java.util.*;

class Program34_4 
{

    public static boolean ChkSpecial(char ch) 
    {

        if(ch=='!' || ch=='@' || ch=='#' || ch=='$' ||
           ch=='%' || ch=='^' || ch=='&' || ch=='*') 
           {
            return true;
        } else 
            {
            return false;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sobj.next().charAt(0);

        boolean bRet = ChkSpecial(cValue);

        if(bRet == true) 
            {
            System.out.println("It is special Character");
        } else 
            {
            System.out.println("It is not a special Character");
        }
    }
}