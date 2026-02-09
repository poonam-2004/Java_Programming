////////////////////////////////////////////////////////////////////
//
//  Program Name : Program57_4
//  Description  : Calculate checksum of file
//  Input        : File name
//  Output       : Checksum value
//  Author       : Poonam Narayan Palkar
//  Date         : 28/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.FileInputStream;
import java.util.Scanner;

class Program57_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        try
        {
            FileInputStream fin = new FileInputStream(fname);
            int ch = 0, checksum = 0;

            while((ch = fin.read()) != -1)
            {
                checksum = checksum + ch;
            }

            fin.close();
            System.out.println("Checksum is : " + checksum);
        }
        catch(Exception e)
        {
            System.out.println("Unable to calculate checksum");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Demo.txt
//  Output : Checksum is : 1216
//
//////////////////////////////////////////////////////////////////// 