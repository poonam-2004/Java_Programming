////////////////////////////////////////////////////////////////////
//
//  Program Name : Program63_5
//  Description  : Read first 1 KB from Combined.bin
//  Input        : Combined.bin
//  Output       : New file created
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;

class Program63_5
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fin = new FileInputStream("Combined.bin");
        FileOutputStream fout = new FileOutputStream("Output.bin");

        byte arr[] = new byte[1024];

        fin.read(arr);
        fout.write(arr);

        System.out.println("First 1 KB data copied successfully");

        fin.close();
        fout.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Output : First 1 KB data copied successfully
//
////////////////////////////////////////////////////////////////////