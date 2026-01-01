import java.util.*;

class Program33_3 {

    public static boolean ChkDigit(char ch) {
        if(ch >= '0' && ch <= '9') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sobj.next().charAt(0);

        boolean bRet = ChkDigit(cValue);

        if(bRet == true) {
            System.out.println("It is Digit");
        } else {
            System.out.println("It is not a Digit");
        }
    }
}