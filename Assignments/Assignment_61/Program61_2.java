////////////////////////////////////////////////////////////////////
//
//  Program Name : Program61_2
//  Description  : Copy file using byte buffer
//  Input        : Source file name, Destination file name
//  Output       : File copied
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

class Program61_2
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name : ");
        String src = sobj.nextLine();

        System.out.print("Enter destination file name : ");
        String dest = sobj.nextLine();

        FileInputStream fin = new FileInputStream(src);
        FileOutputStream fout = new FileOutputStream(dest);

        byte buffer[] = new byte[1024];
        int bytesRead;

        while((bytesRead = fin.read(buffer)) != -1)
        {
            fout.write(buffer,0,bytesRead);
        }

        System.out.println("File copied successfully");

        fin.close();
        fout.close();
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