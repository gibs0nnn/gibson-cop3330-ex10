package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        //Input
        System.out.print("Enter the price of item 1: ");
        String strItemOnePrice = scanner.next();
        System.out.print("Enter the quantity of item 1: ");
        String strItemOneQuantity = scanner.next();
        System.out.print("Enter the price of item 2: ");
        String strItemTwoPrice = scanner.next();
        System.out.print("Enter the quantity of item 2: ");
        String strItemTwoQuantity = scanner.next();
        System.out.print("Enter the price of item 3: ");
        String strItemThreePrice = scanner.next();
        System.out.print("Enter the quantity of item 3: ");
        String strItemThreeQuantity = scanner.next();

        //Parsing
        int itemOnePrice = Integer.parseInt(strItemOnePrice);
        int itemOneQuantity = Integer.parseInt(strItemOneQuantity);
        int itemTwoPrice = Integer.parseInt(strItemTwoPrice);
        int itemTwoQuantity = Integer.parseInt(strItemTwoQuantity);
        int itemThreePrice = Integer.parseInt(strItemThreePrice);
        int itemThreeQuantity = Integer.parseInt(strItemThreeQuantity);

        //Calculations
        double subTotal = (itemOnePrice * itemOneQuantity) + (itemTwoPrice * itemTwoQuantity)
                + (itemThreePrice * itemThreeQuantity);
        double tax = subTotal * .055;
        double total = subTotal + tax;

        //Output
        System.out.println("Subtotal: $" + (Math.round(subTotal * 100.0) / 100.0));
        System.out.println("Tax: $" + (Math.round(tax * 100.0) / 100.0));
        System.out.println("Total: $" + total);

    }
}
