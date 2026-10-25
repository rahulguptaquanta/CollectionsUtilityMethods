package com.internship.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("How many integers do you want to enter? ");
        int count;

        try {
            count = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
            scanner.close();
            return;
        }

        if (count <= 0) {
            System.out.println("Please enter a number greater than zero.");
            scanner.close();
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            try {
                numbers.add(Integer.parseInt(scanner.nextLine().trim()));
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer. Please restart and enter valid integers.");
                scanner.close();
                return;
            }
        }

        System.out.println("\nOriginal list: " + numbers);

        List<Integer> ascending = new ArrayList<>(numbers);
        Collections.sort(ascending);
        System.out.println("Ascending order: " + ascending);

        List<Integer> descending = new ArrayList<>(numbers);
        Collections.sort(descending, Collections.reverseOrder());
        System.out.println("Descending order: " + descending);

        System.out.println("Minimum element: " + Collections.min(numbers));
        System.out.println("Maximum element: " + Collections.max(numbers));

        scanner.close();
    }
}
