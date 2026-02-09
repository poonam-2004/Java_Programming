import java.util.*;

class Program33_1 {
    
    public static boolean ChkAlpha(char ch) {
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sobj.next().charAt(0);

        boolean bRet = ChkAlpha(cValue);

        if(bRet == true) {
            System.out.println("It is Character");
        } else {
            System.out.println("It is not a Character");
        }
    }
}