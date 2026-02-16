////////////////////////////////////////////////////////////////////
//
//  Program Name : Program63_1
//  Description  : Copy file using buffered streams
//  Input        : Source file, Destination file
//  Output       : File copied successfully
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

class Program63_1
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name : ");
        String src = sobj.nextLine();

        System.out.print("Enter destination file name : ");
        String dest = sobj.nextLine();

        BufferedInputStream bin = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(dest));

        int data = 0;
        while((data = bin.read()) != -1)
        {
            bout.write(data);
        }

        bout.flush();

        System.out.println("File copied using buffered streams");

        bin.close();
        bout.close();
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Input  : Demo.txt Copy.txt
//  Output : File copied using buffered streams
//
////////////////////////////////////////////////////////////////////