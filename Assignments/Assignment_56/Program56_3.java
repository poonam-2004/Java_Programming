////////////////////////////////////////////////////////////////////
//
//  Program Name : Program56_3
//  Description  : Write data at the end of existing file
//  Input        : File name, Data
//  Output       : Data written status
//  Author       : Poonam Narayan Palkar
//  Date         : 28/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.FileOutputStream;
import java.util.Scanner;

class Program56_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        System.out.print("Enter data : ");
        String data = sobj.nextLine();

        try
        {
            FileOutputStream fout = new FileOutputStream(fname, true);
            fout.write(data.getBytes());
            fout.close();

            System.out.println("Data written successfully");
        }
        catch(Exception e)
        {
            System.out.println("Unable to write data");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Demo.txt, Welcome
//  Output : Data written successfully
//
//////////////////////////////////////////////////////////////////// 