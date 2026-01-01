class Program34_1 
{

    public static void DisplayASCII() 
    {
        System.out.println("Symbol\tDecimal\tHex\tOctal");

        for(int i = 0; i <= 255; i++) 
            {
            char ch = (char)i;
            System.out.println(ch + "\t" + i + "\t" + Integer.toHexString(i).toUpperCase() + "\t" + Integer.toOctalString(i));
        }
    }

    public static void main(String[] args) 
    {
        DisplayASCII();
    }
}