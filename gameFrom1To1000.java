package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final Random RANDOM = new Random();

        Scanner scanner = new Scanner(System.in);
        int userNum = makeNumber(scanner);
        int compNum = RANDOM.nextInt(1000) + 1;
        while (userNum != compNum) {

            if (userNum > compNum) {
                System.out.println("Try entering a lower number");
                userNum = makeNumber(scanner);

            } else {
                System.out.println("Try to enter a larger number");
                userNum = makeNumber(scanner);
            }
        }
        System.out.println("You guessed the number! Congratulations!");
    }

    private static int makeNumber(Scanner scanner) {
        int i;

        do {
            System.out.println("Please enter any number from 1 to 1000:");

            while (!scanner.hasNextInt()) {
                System.out.println("Error.You have entered no number");
                scanner.next();
            }
            i = scanner.nextInt();
        } while (i <= 0 || i > 1000);
        return i;
    }


}
