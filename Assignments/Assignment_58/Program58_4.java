////////////////////////////////////////////////////////////////////
//
//  Program Name : Program58_4
//  Description  : Write file name and data into Marvellous.txt
//  Input        : Directory name(.)
//  Output       : File name with data
//  Author       : Poonam Narayan Palkar
//  Date         : 28/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

class Program58_4
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
                        fout.write(("File Name : " + f.getName() + "\n").getBytes());

                        FileInputStream fin = new FileInputStream(f);
                        int ch;

                        while((ch = fin.read()) != -1)
                        {
                            fout.write(ch);
                        }

                        fout.write("\n\n".getBytes());
                        fin.close();
                    }
                }

                fout.close();
                System.out.println("File name and data written successfully");
            }
            catch(Exception e)
            {
                System.out.println("Error");
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
//  Output : Marvellous.txt contains file names and data
//
//////////////////////////////////////////////////////////////////// 