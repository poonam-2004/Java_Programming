import java.util.*;

class Program34_2 
{

    public static void Display(char ch)
     {
        if(ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - 32);   
        }
        else if(ch >= 'A' && ch <= 'Z') 
            {
            ch = (char)(ch + 32);   
        }

        System.out.println(ch);
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sobj.next().charAt(0);

        Display(cValue);
    }
}