import java.util.*;

class Program35_4 
{

    public static boolean ChkVowel(String str) 
    {

        for(int i = 0; i < str.length(); i++) 
            {
            char ch = str.charAt(i);

            if("aeiouAEIOU".indexOf(ch) != -1) 
                {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
     {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string:");
        String arr = sobj.nextLine();

        boolean bRet = ChkVowel(arr);

        if(bRet == true) 
            {
            System.out.println("Contains Vowel");
        } else 
            {
            System.out.println("There is no Vowel");
        }
    }
}