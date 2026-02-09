////////////////////////////////////////////////////////////////////
//
//  Program Name : Program57_3
//  Description  : Create directory if it does not exist
//  Input        : Directory name
//  Output       : Directory creation status
//  Author       : Poonam Narayan Palkar
//  Date         : 28/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class Program57_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String dname = sobj.nextLine();

        File dobj = new File(dname);

        if(dobj.mkdir())
        {
            System.out.println("Directory created successfully");
        }
        else
        {
            System.out.println("Directory already exists or cannot be created");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Marvellous
//  Output : Directory created successfully
//
//////////////////////////////////////////////////////////////////// 