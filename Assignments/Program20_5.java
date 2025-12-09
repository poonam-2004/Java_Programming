class Logic
{
    void findSmallestDigit(int num)
    {
        int min = 9;

        while(num > 0)
        {
            int digit = num % 10;
            if(digit < min)
                min = digit;
            num = num / 10;
        }

        System.out.println("Smallest digit is: " + min);
    }
}

class Program20_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}