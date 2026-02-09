////////////////////////////////////////////////////////////////////
//
//  Program Name : Program56_5
//  Description  : Display all file names from directory
//  Input        : Directory name(.)
//  Output       : File names
//  Author       : Poonam Narayan Palkar
//  Date         : 28/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class Program56_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String dname = sobj.nextLine();

        File dobj = new File(dname);

        if(dobj.exists() && dobj.isDirectory())
        {
            String files[] = dobj.list();

            System.out.println("Files in directory :");
            for(String fname : files)
            {
                System.out.println(fname);
            }
        }
        else
        {
            System.out.println("Invalid directory");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : .
//  Output : Demo.java
//           Test.txt
//           Hello.class
//
//////////////////////////////////////////////////////////////////// 