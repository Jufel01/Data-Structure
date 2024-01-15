/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.birthmonth;

/**
 *
 * @author JUFEL
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BirthMonth {
    public static void main(String[] args) {
        // Step 1: Create empty hash sets named group1, group2, and self.
        Set<String> group1 = new HashSet<>();
        Set<String> group2 = new HashSet<>();
        Set<String> self = new HashSet<>();

        // Step 2: Ask six (6) classmates to enter their birth month.
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter birth month " + i + ": ");
            String birthMonth = scanner.nextLine();

            // The first three values shall be added to the group1 set and the remaining to group2.
            if (i <= 3) {
                group1.add(birthMonth);
            } else {
                group2.add(birthMonth);
            }
        }

        // Display the values entered by each group.
        System.out.println("Group 1: " + group1);
        System.out.println("Group 2: " + group2);

        // Step 3: Ask to type your birth month, which is to be stored in the set named self.
        System.out.print("Enter your birth month: ");
        String yourBirthMonth = scanner.nextLine();
        self.add(yourBirthMonth);

        // Step 4: Show the union, intersection, and difference based on the two groups.
        Set<String> union = new HashSet<>(group1);
        union.addAll(group2);

        Set<String> intersection = new HashSet<>(group1);
        intersection.retainAll(group2);

        Set<String> difference = new HashSet<>(group1);
        difference.removeAll(group2);

        // Display the results.
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference: " + difference);

        // Display a message whether you have the same birth month with any of your classmates.
        if (self.stream().anyMatch(group1::contains) || self.stream().anyMatch(group2::contains)) {
            System.out.println("You have the same birth month with one of your classmates.");
        } else {
            System.out.println("You do not have the same birth month with any of your classmates.");
        }

        // Close the scanner to prevent resource leak.
        scanner.close();
    }
}