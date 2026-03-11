///////////////////////////////////////////////////////////////////
//
//  Program Name : Program76_4
//  Description  : Calculate how many items can be purchased
//  Input        : Budget, number of items, item prices
//  Output       : Items purchased and remaining balance
//  Author       : Poonam Narayan Palkar
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program76_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter budget amount : ");
        int budget = sobj.nextInt();

        System.out.print("Enter number of items : ");
        int n = sobj.nextInt();

        if(budget < 0 || n < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int count = 0;

        for(int i = 1; i <= n; i++)
        {
            System.out.print("Enter price of item " + i + " : ");
            int price = sobj.nextInt();

            if(price > budget)
            {
                break;
            }

            budget = budget - price;
            count++;
        }

        System.out.println("Items Purchased: " + count);
        System.out.println("Remaining Balance: ₹" + budget);

        sobj.close();
    }
}

/*

Test Case 1
Input :
Budget = 100
Items = 3
Prices = 20 30 40

Output :
Items Purchased: 3
Remaining Balance: ₹10

--------------------------------

Test Case 2
Input :
Budget = 50
Items = 3
Prices = 20 25 30

Output :
Items Purchased: 2
Remaining Balance: ₹5

*/