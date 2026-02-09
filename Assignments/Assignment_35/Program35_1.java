import java.util.*;

class Program35_1 
{

    public static int CountCapital(String str) 
    
    {
        int iCnt = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z') 
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

        int iRet = CountCapital(arr);

        System.out.println(iRet);
    }
}