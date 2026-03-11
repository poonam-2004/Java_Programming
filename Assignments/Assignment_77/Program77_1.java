///////////////////////////////////////////////////////////////////
//
//  Program Name : Program77_1
//  Description  : Calculate hospital bill with insurance coverage
//  Input        : Days, Ward type, Medicine bill, Consultation fee, Insurance
//  Output       : Total bill, Insurance cover, Final payable amount
//  Author       : Poonam Narayan Palkar
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program77_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of days : ");
        int days = sobj.nextInt();

        System.out.print("Enter ward type (Normal/ICU) : ");
        String ward = sobj.next();

        System.out.print("Enter medicine bill : ");
        int medicine = sobj.nextInt();

        System.out.print("Enter consultation fee : ");
        int consultation = sobj.nextInt();

        System.out.print("Insured (Yes/No) : ");
        String insured = sobj.next();

        if(days < 0 || medicine < 0 || consultation < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int roomCharge = 0;

        if(ward.equals("Normal"))
        {
            roomCharge = days * 2000;
        }
        else if(ward.equals("ICU"))
        {
            roomCharge = days * 5000;
        }
        else
        {
            System.out.println("Invalid Ward Type");
            return;
        }

        int totalBill = roomCharge + medicine + consultation;

        double insuranceCover = 0;

        if(insured.equals("Yes"))
        {
            insuranceCover = Math.min(totalBill * 0.70, 50000);
        }

        double finalPay = totalBill - insuranceCover;

        System.out.println("Total Bill: ₹" + totalBill);
        System.out.println("Insurance Cover: ₹" + insuranceCover);
        System.out.println("Final Pay: ₹" + finalPay);

        sobj.close();
    }
}
