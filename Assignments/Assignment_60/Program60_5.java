////////////////////////////////////////////////////////////////////
//
//  Program Name : Program60_5
//  Description  : Check whether path exists and type
//  Input        : Path
//  Output       : File or Directory
//  Author       : Poonam Narayan Palkar
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class Program60_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter path : ");
        String pname = sobj.nextLine();

        File dobj = new File(pname);

        if(dobj.exists())
        {
            if(dobj.isFile())
            {
                System.out.println("It is a file");
            }
            else if(dobj.isDirectory())
            {
                System.out.println("It is a directory");
            }
        }
        else
        {
            System.out.println("Path does not exist");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Demo.txt
//  Output : It is a file
//
//  Input  : .
//  Output : It is a directory
//
////////////////////////////////////////////////////////////////////