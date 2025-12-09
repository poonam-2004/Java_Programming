class Logic
{
    void findMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println("Maximum number is: " + a);
        }
        else if(b > a)
        {
            System.out.println("Maximum number is: " + b);
        }
        else
        {
            System.out.println("Both numbers are equal: " + a);
        }
    }
}

class Program17_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMax(20, 15);
    }
}