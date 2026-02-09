////////////////////////////////////////////////////////////////////
//
//  Program Name : Program56_1
//  Description  : Accept file name from user and open that file
//  Input        : File name
//  Output       : File opened status
//  Author       : Poonam Narayan Palkar
//  Date         : 28/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class Program56_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        File fobj = new File(fname);

        if(fobj.exists())
        {
            System.out.println("File opened successfully");
        }
        else
        {
            System.out.println("File not found");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Demo.txt
//  Output : File opened successfully
//
//////////////////////////////////////////////////////////////////// 