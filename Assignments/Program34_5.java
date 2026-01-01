import java.util.*;

class Program34_5 
{

    public static void Display(char ch) 
    {

        int val = (int)ch;

        System.out.println("Decimal\t\t" + val);
        System.out.println("Octal\t\t" + Integer.toOctalString(val));
        System.out.println("Hexadecimal\t0X" + Integer.toHexString(val).toUpperCase());
    }

    public static void main(String[] args) 
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sobj.next().charAt(0);

        Display(cValue);
    }
}