////////////////////////////////////////////////////////////////////
//
//  Program Name : Program57_5
//  Description  : Display file names and size from directory
//  Input        : Directory name (.)
//  Output       : File names with size
//  Author       : Poonam Narayan Palkar
//  Date         : 28/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class Program57_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String dname = sobj.nextLine();

        File dobj = new File(dname);

        if(dobj.exists() && dobj.isDirectory())
        {
            File files[] = dobj.listFiles();

            for(File f : files)
            {
                System.out.println(f.getName() + " : " + f.length() + " bytes");
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
//  Output : Program57_1.java : 1161 bytes
//           Program57_2.java : 980 bytes
//
//////////////////////////////////////////////////////////////////// 