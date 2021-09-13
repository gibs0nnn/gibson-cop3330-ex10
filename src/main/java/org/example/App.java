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
        int itemOnePrice = scanner.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        int itemOneQuantity = scanner.nextInt();
        System.out.print("Enter the price of item 2: ");
        int itemTwoPrice = scanner.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        int itemTwoQuantity = scanner.nextInt();
        System.out.print("Enter the price of item 3: ");
        int itemThreePrice = scanner.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        int itemThreeQuantity = scanner.nextInt();

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
