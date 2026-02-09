class Logic
{
    void printDivisibleBy2and3(int n)
    {
        System.out.println("Numbers divisible by both 2 and 3 are:");

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0 && i % 3 == 0)
            {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}

class Program21_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }
}