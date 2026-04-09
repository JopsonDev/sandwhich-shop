package com.pluarlsight;

import java.util.Scanner;

public class SandwhichShop {
    public static void main(String[] args) {
        Scanner shop = new Scanner(System.in);

        System.out.print("Would you Like a regular or large sandwhich? ");
        String input = shop.nextLine();
        //System.out.print("Would you like to make it loaded? ");
        //String loaded = shop.nextLine();
        System.out.print("Great! and your age? ");
        int age = shop.nextInt();
        int size = (input.equalsIgnoreCase("regular")) ? 1 : input.equalsIgnoreCase("large") ? 2: 0;
        double price;
        if (size == 1) {
            price = 5.45;
        } else if (size == 2){
            price = 8.95;
        } else {
            price = 0;
            System.out.println("We dont have that size but..");
        }
        double discount;
        if (age <= 17) {
            discount = .90;
        } else if (age >= 65){
            discount = .80;
        } else {
            discount = 1;
        }
/*        double extra;
        if (loaded.equalsIgnoreCase("yes") && size == 1) {
            extra = 1.00;
        } else if (loaded.equalsIgnoreCase("yes") && size == 2) {
            extra = 1.75;
        } else {
            extra = 0;
        }*/
        price = price * discount;
        System.out.printf("Your total comes too: %.2f", price);
    }
}
