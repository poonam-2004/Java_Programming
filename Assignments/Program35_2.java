import java.util.*;

class Program35_2
 {

    public static int CountSmall(String str) 
    {
        int iCnt = 0;

        for(int i = 0; i < str.length(); i++) 
            {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z') 
                {
                iCnt++;
            }
        }
        return iCnt;
    }

    public static void main(String[] args) 
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string:");
        String arr = sobj.nextLine();

        int iRet = CountSmall(arr);

        System.out.println(iRet);
    }
}