class Logic
{
    void printOddNumbers(int n)
    {
        System.out.println("Odd numbers up to " + n + ":");
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}

class Program18_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}