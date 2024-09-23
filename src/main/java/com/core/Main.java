package com.core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean b = true;
        Functions functions = new Functions();
        Scanner scanner = new Scanner(System.in);

        while (b) {
            int constructionIndex = functions.enterConstruction();
            int toolIndex = functions.enterTool();
            functions.calc(constructionIndex, toolIndex);

            boolean c = true;
            while (c) {
                System.out.println("Press 1 to see more info and 2 to exit");
                try {
                    int input = scanner.nextInt();
                    scanner.nextLine();
                    if (input == 1) {
                        System.out.println("\nMore info");
                        c= false;
                    } else if (input == 2) {
                        b = false;
                        c= false;
                        System.exit(0);
                    } else {
                        System.out.println("Invalid input");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input, please enter a number");
                    scanner.nextLine();
                }
            }
        }

        scanner.close();
    }
}