////////////////////////////////////////////////////////////////////
//
//  Program Name : Program58_2
//  Description  : Write names of all files into Marvellous.txt
//  Input        : Directory name(.)
//  Output       : File created with names
//  Author       : Poonam Narayan Palkar
//  Date         : 28/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Program58_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String dname = sobj.nextLine();

        File dobj = new File(dname);

        if(dobj.exists() && dobj.isDirectory())
        {
            try
            {
                FileWriter fw = new FileWriter("Marvellous.txt");
                File files[] = dobj.listFiles();

                for(File f : files)
                {
                    fw.write(f.getName() + "\n");
                }

                fw.close();
                System.out.println("File names written successfully");
            }
            catch(Exception e)
            {
                System.out.println("Error while writing file");
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
//  Output : Marvellous.txt created with file names
//
//////////////////////////////////////////////////////////////////// 