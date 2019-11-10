package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("enter your weight:");

        Scanner scanner = new Scanner(System.in);

       int number = scanner.nextInt();

       int number1 = 6;

        System.out.println("your weight on the moon will be:");

        System.out.println( number  / number1 );

    }
}
