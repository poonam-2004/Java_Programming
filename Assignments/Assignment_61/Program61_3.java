////////////////////////////////////////////////////////////////////
//
//  Program Name : Program61_3
//  Description  : Append string at end of file
//  Input        : File name, String
//  Output       : String appended
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

class Program61_3
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        System.out.print("Enter string to append : ");
        String data = sobj.nextLine();

        FileWriter fw = new FileWriter(fname,true);

        fw.write(data);

        System.out.println("Data appended successfully");

        fw.close();
        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Demo.txt  Hello
//  Output : Data appended successfully
//
////////////////////////////////////////////////////////////////////