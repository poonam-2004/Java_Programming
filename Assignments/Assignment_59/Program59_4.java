////////////////////////////////////////////////////////////////////
//
//  Program Name : Program59_4
//  Description  : Count total files and folders
//  Input        : Directory name
//  Output       : Total files and folders count
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class Program59_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int fileCount = 0;
        int folderCount = 0;

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
                    fileCount++;
                }
                else if(f.isDirectory())
                {
                    folderCount++;
                }
            }

            System.out.println("Total Files : " + fileCount);
            System.out.println("Total Folders : " + folderCount);
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
//  Output : Total Files : 5
//           Total Folders : 2
//
////////////////////////////////////////////////////////////////////