import java.util.*;

class Program33_5 {

    public static void DisplaySchedule(char chDiv) {

        if(chDiv >= 'a' && chDiv <= 'z') {
            chDiv = (char)(chDiv - 32);  // convert to uppercase
        }

        if(chDiv == 'A') {
            System.out.println("Your exam at 7 AM");
        }
        else if(chDiv == 'B') {
            System.out.println("Your exam at 8.30 AM");
        }
        else if(chDiv == 'C') {
            System.out.println("Your exam at 9.20 AM");
        }
        else if(chDiv == 'D') {
            System.out.println("Your exam at 10.30 AM");
        }
        else {
            System.out.println("Invalid Division");
        }
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your division:");
        char cValue = sobj.next().charAt(0);

        DisplaySchedule(cValue);
    }
}