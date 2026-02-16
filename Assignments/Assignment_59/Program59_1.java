////////////////////////////////////////////////////////////////////
//
//  Program Name : Program59_1
//  Description  : Display names of all files from directory
//  Input        : Directory name (.)
//  Output       : File names
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class Program59_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String dname = sobj.nextLine();

        File dobj = new File(dname);

        if(dobj.exists() && dobj.isDirectory())
        {
            String files[] = dobj.list();

            for(String name : files)
            {
                System.out.println(name);
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
//  Output : Program59_1.java
//           Demo.txt
//           Folder1
//
////////////////////////////////////////////////////////////////////