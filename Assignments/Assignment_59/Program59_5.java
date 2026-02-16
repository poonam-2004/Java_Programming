////////////////////////////////////////////////////////////////////
//
//  Program Name : Program59_5
//  Description  : Display file name with absolute path
//  Input        : Directory name
//  Output       : File name and absolute path
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class Program59_5
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
                    System.out.println(f.getName() + " : " + f.getAbsolutePath());
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
//  Output : Demo.txt : D:\Desktop\Demo.txt
//
////////////////////////////////////////////////////////////////////