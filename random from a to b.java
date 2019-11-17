package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        int a = Math.max(num1, num2);

        int b = Math.min(num1, num2);

        int c = ThreadLocalRandom.current().nextInt(b, a + 1);

        System.out.println("random number is:");
        System.out.println(c);

    }

}
