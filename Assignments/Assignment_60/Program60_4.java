////////////////////////////////////////////////////////////////////
//
//  Program Name : Program60_3
//  Description  : Display smallest file from directory
//  Input        : Directory name
//  Output       : Smallest file name
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class Program60_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String dname = sobj.nextLine();

        File dobj = new File(dname);

        if(dobj.exists() && dobj.isDirectory())
        {
            File arr[] = dobj.listFiles();

            File smallest = null;
            long min = Long.MAX_VALUE;

            for(File f : arr)
            {
                if(f.isFile())
                {
                    if(f.length() < min)
                    {
                        min = f.length();
                        smallest = f;
                    }
                }
            }

            if(smallest != null)
            {
                System.out.println("Smallest file is : " + smallest.getName());
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
//  Output : Smallest file is : Test.txt
//
////////////////////////////////////////////////////////////////////