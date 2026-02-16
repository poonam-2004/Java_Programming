////////////////////////////////////////////////////////////////////
//
//  Program Name : Program59_2
//  Description  : Display only regular files
//  Input        : Directory name
//  Output       : Regular file names
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class Program59_2
{
    public static void main(String A[])
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
                if(f.isFile())
                {
                    System.out.println(f.getName());
                }
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
//  Output : Demo.txt
//           Program59_2.java
//
////////////////////////////////////////////////////////////////////