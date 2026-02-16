////////////////////////////////////////////////////////////////////
//
//  Program Name : Program62_3
//  Description  : Copy last N bytes into new file
//  Input        : File name, Number
//  Output       : New file created
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

class Program62_3
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name : ");
        String src = sobj.nextLine();

        System.out.print("Enter destination file name : ");
        String dest = sobj.nextLine();

        System.out.print("Enter number of bytes : ");
        int iNo = sobj.nextInt();

        File file = new File(src);
        long size = file.length();

        FileInputStream fin = new FileInputStream(src);
        FileOutputStream fout = new FileOutputStream(dest);

        fin.skip(size - iNo);

        int data = 0;
        while((data = fin.read()) != -1)
        {
            fout.write(data);
        }

        System.out.println("Last N bytes copied successfully");

        fin.close();
        fout.close();
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Input  : Demo.txt Copy.txt 10
//  Output : Last N bytes copied successfully
//
////////////////////////////////////////////////////////////////////