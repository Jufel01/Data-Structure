/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book;

/**
 *
 * @author JUFEL
 */
import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Book {
    public static void main(String[] args) {
        Queue<String> bookQueue = new LinkedList<>();
        Stack<String> titleStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter four book titles.");
        int numBook = 4;
        
        for (int i = 1; i <= numBook; i++) {
            System.out.print("Book " + i + ": ");
            String enteredTitle = input.nextLine();
            titleStack.push(enteredTitle);
        }
        
        for (int i = 1; i <= numBook; i++) {
            bookQueue.offer(titleStack.pop());
        }
        
        System.out.println("New order of books:");
        System.out.println(bookQueue);
    }
}