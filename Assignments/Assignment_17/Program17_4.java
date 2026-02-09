class Logic
{
    void findMin(int a, int b, int c)
    {
        int min;

        if(a < b && a < c)
        {
            min = a;
        }
        else if(b < c)
        {
            min = b;
        }
        else
        {
            min = c;
        }

        System.out.println("Minimum number is: " + min);
    }
}

class Program17_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMin(3, 7, 2);
    }
}