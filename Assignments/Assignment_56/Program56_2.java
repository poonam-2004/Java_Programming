////////////////////////////////////////////////////////////////////
//
//  Program Name : Program56_2
//  Description  : Open file and display its contents
//  Input        : File name
//  Output       : File data
//  Author       : Poonam Narayan Palkar
//  Date         : 28/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.FileInputStream;
import java.util.Scanner;

class Program56_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        try
        {
            FileInputStream fin = new FileInputStream(fname);
            int ch = 0;

            while((ch = fin.read()) != -1)
            {
                System.out.print((char)ch);
            }

            fin.close();
        }
        catch(Exception e)
        {
            System.out.println("Unable to open file");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Demo.txt
//  Output : Hello Marvellous
//
//////////////////////////////////////////////////////////////////// 