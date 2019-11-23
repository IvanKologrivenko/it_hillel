package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter number of approach:");

        Scanner scanner = new Scanner(System.in);
        int approach = scanner.nextInt();
        int repeats = pullUp(approach);

        System.out.printf("The number of repeats is\n%s", repeats);

    }

    private static int pullUp(int n) {
        int sum;

        if (n == 0) {
            return 0;
        } else {
            sum = n + pullUp(n - 1);
        }
            return sum;
    }
}
