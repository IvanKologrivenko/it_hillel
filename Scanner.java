package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("enter the year of your birth:");

        Scanner scanner = new Scanner(System.in);

       int number = scanner.nextInt();

       int number1 = 2019;

        System.out.println("your age is:");

        System.out.println( number1 - number );

    }
}
