////////////////////////////////////////////////////////////////////
//
//  Program Name : Program61_5
//  Description  : Split file into two halves
//  Input        : File name
//  Output       : Two files created
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

class Program61_5
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        File fobj = new File(fname);

        FileInputStream fin = new FileInputStream(fname);

        int size = (int)fobj.length();
        int half = size / 2;

        FileOutputStream fout1 = new FileOutputStream("FirstHalf.txt");
        FileOutputStream fout2 = new FileOutputStream("SecondHalf.txt");

        int data;
        int count = 0;

        while((data = fin.read()) != -1)
        {
            if(count < half)
                fout1.write(data);
            else
                fout2.write(data);

            count++;
        }

        System.out.println("File split successfully");

        fin.close();
        fout1.close();
        fout2.close();
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Demo.txt
//  Output : File split successfully
//
////////////////////////////////////////////////////////////////////