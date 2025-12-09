class Logic
{
    void sumOfDigits(int num)
    {
        int sum = 0;
        while(num != 0)
        {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}

class Program17_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}