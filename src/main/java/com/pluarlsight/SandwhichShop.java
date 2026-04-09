package com.pluarlsight;

import java.util.Scanner;

public class SandwhichShop {
    public static void main(String[] args) {
        Scanner shop = new Scanner(System.in);

        System.out.print("Would you Like a regular or large sandwhich? ");
        String input = shop.nextLine();
        if (!input.equalsIgnoreCase("regular") && !input.equalsIgnoreCase("large")) {
            System.out.println("We dont have that size today, sorry");
            return;
        }
        System.out.print("Would you like to make it loaded? ");
        String loaded = shop.nextLine();
        System.out.print("Great! and your age? ");
        int age = shop.nextInt();
        int size = (input.equalsIgnoreCase("regular")) ? 1 : input.equalsIgnoreCase("large") ? 2: 0;
        double price;
        if (size == 1) {
            price = 5.45;
        } else {
            price = 8.95;
        }
        double discount;
        if (age <= 17) {
            discount = .90;
        } else if (age >= 65){
            discount = .80;
        } else {
            discount = 1;
        }
       double extra = 0;
        if (loaded.equalsIgnoreCase("yes")) {
            if (size == 1) {
                extra = 1.00;
            } else if (size == 2) {
                extra = 1.75;
            }
        }
        price = (price + extra) * discount;
        System.out.printf("Your total comes too: %.2f", price);
    }

}
