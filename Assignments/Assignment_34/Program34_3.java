import java.util.*;

class Program34_3
 {

    public static void Display(char ch)
     {

        if(ch >= 'A' && ch <= 'Z')
             {

            for(char c = ch; c <= 'Z'; c++) 
                {
                System.out.print(c + "\t");
            }
        }
        else if(ch >= 'a' && ch <= 'z') 
            
            {

            for(char c = ch; c >= 'a'; c--) {
                System.out.print(c + "\t");
            }
        }
        else 
            {
            return; 
        }
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sobj.next().charAt(0);

        Display(cValue);
    }
}