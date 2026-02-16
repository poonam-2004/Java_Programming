////////////////////////////////////////////////////////////////////
//
//  Program Name : Program63_2
//  Description  : Compare time of normal streams and buffered streams
//  Input        : Source file, Destination files
//  Output       : Time required
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;

class Program63_2
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fin = new FileInputStream("Demo.txt");
        FileOutputStream fout = new FileOutputStream("NormalCopy.txt");

        long start = System.currentTimeMillis();

        int data = 0;
        while((data = fin.read()) != -1)
        {
            fout.write(data);
        }

        long end = System.currentTimeMillis();
        System.out.println("Normal Stream Time : " + (end - start) + " ms");

        fin.close();
        fout.close();

        BufferedInputStream bin = new BufferedInputStream(new FileInputStream("Demo.txt"));
        BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("BufferedCopy.txt"));

        start = System.currentTimeMillis();

        while((data = bin.read()) != -1)
        {
            bout.write(data);
        }

        bout.flush();
        end = System.currentTimeMillis();

        System.out.println("Buffered Stream Time : " + (end - start) + " ms");

        bin.close();
        bout.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Output :
//  Normal Stream Time   : XXXX ms
//  Buffered Stream Time : YYYY ms
//
////////////////////////////////////////////////////////////////////