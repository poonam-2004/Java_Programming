class Logic
{
    void printDigits(int num)
    {
        System.out.println("Digits of " + num + " are:");

        while(num > 0)
        {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }
}

class Program19_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}