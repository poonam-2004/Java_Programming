////////////////////////////////////////////////////////////////////
//
//  Program Name : Program56_4
//  Description  : Create new file if it does not exist
//  Input        : File name
//  Output       : File creation status
//  Author       : Poonam Narayan Palkar
//  Date         : 28/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class Program56_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        try
        {
            File fobj = new File(fname);

            if(fobj.createNewFile())
            {
                System.out.println("File created successfully");
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(Exception e)
        {
            System.out.println("Error while creating file");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : NewFile.txt
//  Output : File created successfully
//
//////////////////////////////////////////////////////////////////// 