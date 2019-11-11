package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("enter first number:");

        Scanner scanner1 = new Scanner(System.in);

        int number1 = scanner1.nextInt();



        System.out.println("enter second number:");

        Scanner scanner2 = new Scanner(System.in);

        int number2 = scanner2.nextInt();

        System.out.println("min:");
        System.out.println( (number1 > number2 ) ? number2 : number1);

    }
}
