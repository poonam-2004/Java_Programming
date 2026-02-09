class Logic
{
    void countEvenOddRange(int n)
    {
        int evenCount = 0, oddCount = 0;

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}

class Program21_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}