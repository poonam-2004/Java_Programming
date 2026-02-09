class Logic
{
    void displayGrade(int marks)
    {
        if(marks >= 90)
            System.out.println("Grade: A+");
        else if(marks >= 75)
            System.out.println("Grade: A");
        else if(marks >= 60)
            System.out.println("Grade: B");
        else if(marks >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }
}

class Program19_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}