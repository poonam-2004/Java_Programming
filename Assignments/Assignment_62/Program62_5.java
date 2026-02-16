////////////////////////////////////////////////////////////////////
//
//  Program Name : Program62_5
//  Description  : Handle file related exceptions
//  Input        : File name
//  Output       : Safe execution
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

class Program62_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter file name : ");
            String fname = sobj.nextLine();

            FileInputStream fin = new FileInputStream(fname);

            System.out.println("File opened successfully");

            fin.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error : File not found");
        }
        catch(IOException e)
        {
            System.out.println("Error : Input Output exception");
        }
        finally
        {
            sobj.close();
        }
    }
}

////////////////////////////////////////////////////////////////////
//
//  Input  : Demo.txt
//  Output : File opened successfully
//
////////////////////////////////////////////////////////////////////