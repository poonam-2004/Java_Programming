////////////////////////////////////////////////////////////////////
//
//  Program Name : Program57_2
//  Description  : Check whether file is regular file or not
//  Input        : File name
//  Output       : File type status
//  Author       : Poonam Narayan Palkar
//  Date         : 28/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class Program57_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        File fobj = new File(fname);

        if(fobj.exists() && fobj.isFile())
        {
            System.out.println("It is a regular file");
        }
        else
        {
            System.out.println("It is not a regular file");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Demo.txt
//  Output : It is a regular file
//
//////////////////////////////////////////////////////////////////// 