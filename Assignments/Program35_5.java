import java.util.*;

class Program35_5 
{

    public static void Reverse(String str) 
    {

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println(sb.toString());
    }

    public static void main(String[] args) 
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string:");
        String arr = sobj.nextLine();

        Reverse(arr);
    }
}