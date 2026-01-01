import java.util.*;

class Program33_2 {

    public static boolean ChkCapital(char ch) {
        if(ch >= 'A' && ch <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sobj.next().charAt(0);

        boolean bRet = ChkCapital(cValue);

        if(bRet == true) {
            System.out.println("It is Capital Character");
        } else {
            System.out.println("It is not a Capital Character");
        }
    }
}