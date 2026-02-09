////////////////////////////////////////////////////////////////////
//
//  Program Name : Program57_1
//  Description  : Copy data from one file into newly created file
//  Input        : Source file name, Destination file name
//  Output       : Data copied status
//  Author       : Poonam Narayan Palkar
//  Date         : 28/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class Program57_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name : ");
        String src = sobj.nextLine();

        System.out.print("Enter destination file name : ");
        String dest = sobj.nextLine();

        try
        {
            FileInputStream fin = new FileInputStream(src);
            FileOutputStream fout = new FileOutputStream(dest);

            int ch = 0;
            while((ch = fin.read()) != -1)
            {
                fout.write(ch);
            }

            fin.close();
            fout.close();

            System.out.println("File copied successfully");
        }
        catch(Exception e)
        {
            System.out.println("Unable to copy file");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Demo.txt  Copy.txt
//  Output : File copied successfully
//
//////////////////////////////////////////////////////////////////// 