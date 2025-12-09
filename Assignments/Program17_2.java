class Logic
{
    void checkPalindrome(int num)
    {
        int original = num;
        int reverse = 0;
        
        while(num != 0)
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        
        if(original == reverse)
        {
            System.out.println(original + " is a palindrome.");
        }
        else
        {
            System.out.println(original + " is not a palindrome.");
        }
    }
}

class Program17_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}