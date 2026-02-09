class Logic
{
    void findLargestDigit(int num)
    {
        int max = 0;

        while(num > 0)
        {
            int digit = num % 10;
            if(digit > max)
                max = digit;
            num = num / 10;
        }

        System.out.println("Largest digit is: " + max);
    }
}

class Program20_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}