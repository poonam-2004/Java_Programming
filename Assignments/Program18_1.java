class Logic
{
    void checkPrime(int num)
    {
        if(num <= 1)
        {
            System.out.println(num + " is not a prime number.");
            return;
        }

        boolean isPrime = true;

        for(int i = 2; i <= num / 2; i++)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

class Program18_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}