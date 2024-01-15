/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grocerystore;

/**
 *
 * @author JUFEL
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GroceryStore {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
            System.out.print("What is your name? ");
            String name = input.nextLine();
            Thread.sleep(2000);
                System.out.println("Nice to meet you, " + name +". I'm John");
                System.out.print("What is your order? ");
                    String order = input.nextLine();
                        System.out.println("Your order is " + order);
                            System.out.print("Cash or Card? ");
                Thread.sleep(2000);
                String coc = input.nextLine();
            if (coc.equalsIgnoreCase("Cash"))
                System.out.println("That's nice to know!");
                else if (coc.equalsIgnoreCase("Card"))
                    System.out.println("Okay. please make sure that you have enough balance on the card to pay fo all your order!");
                else 
                   System.out.println("Thank you! Come Again");
                   Thread.sleep(2000);
                   
            System.out.println("Where should I put the things you bought in the cardboard or in the echo bag? so that you are not difficult to carry ");
            String cbe = input.nextLine();
            ArrayList choices = new ArrayList();
            Collections.addAll(choices, "CardBoard", "Echo Bag", "Paper Bag");
            Collections.shuffle(choices);
            Thread.sleep(2000);
            System.out.println(cbe + "? " + "Okay, I got You. Thank you for purchasing");
    }
}