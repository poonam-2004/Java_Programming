class Logic
{
    void findFactorial(int num)
    {
        int fact = 1;
        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}

class Program16_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}