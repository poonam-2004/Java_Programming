////////////////////////////////////////////////////////////////////
//
//  Program Name : Program58_3
//  Description  : Write data of all files into Marvellous.txt
//  Input        : Directory name(.)
//  Output       : Combined file data
//  Author       : Poonam Narayan Palkar
//  Date         : 28/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

class Program58_3
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
                FileOutputStream fout = new FileOutputStream("Marvellous.txt");
                File files[] = dobj.listFiles();

                for(File f : files)
                {
                    if(f.isFile())
                    {
                        FileInputStream fin = new FileInputStream(f);
                        int ch;

                        while((ch = fin.read()) != -1)
                        {
                            fout.write(ch);
                        }

                        fin.close();
                    }
                }

                fout.close();
                System.out.println("Data written successfully");
            }
            catch(Exception e)
            {
                System.out.println("Error while writing data");
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
//  Output : Marvellous.txt contains all file data
//
//////////////////////////////////////////////////////////////////// 