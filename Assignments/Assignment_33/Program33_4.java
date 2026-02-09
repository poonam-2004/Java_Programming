import java.util.*;

class Program33_4 {

    public static boolean ChkSmall(char ch) {
        if(ch >= 'a' && ch <= 'z') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sobj.next().charAt(0);

        boolean bRet = ChkSmall(cValue);

        if(bRet == true) {
            System.out.println("It is Small case Character");
        } else {
            System.out.println("It is not a Small case Character");
        }
    }
}