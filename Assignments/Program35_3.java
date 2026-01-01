import java.util.*;

class Program35_3 
{

    public static int Difference(String str)
     {
        int small = 0, capital = 0;

        for(int i = 0; i < str.length(); i++) 
            {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z') 
                
                {
                small++;
            }
            else if(ch >= 'A' && ch <= 'Z') {
                capital++;
            }
        }
        return small - capital;
    }

    public static void main(String[] args) 
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string:");
        String arr = sobj.nextLine();

        int iRet = Difference(arr);

        System.out.println(iRet);
    }
}