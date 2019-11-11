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


        System.out.println("enter third number:");

        Scanner scanner3 = new Scanner(System.in);

        int number3 = scanner3.nextInt();

        int result = 2;
        if (number1 < number2 && number1 < number3) {
            result = number1;
        }
        if (number2 < number1 && number2 < number3) {
            result = number2;
        }
        if (number3 < number2 && number3 < number1) {
            result = number3;
        }
        System.out.println("min:");
        System.out.println(result);


        int result1 = 3;
        if (number1 > number2 && number1 > number3) {
            result1 = number1;
        }
        if (number2 > number1 && number2 > number3) {
            result1 = number2;
        }
        if (number3 > number2 && number3 > number1) {
            result1 = number3;
        }
        System.out.println("max:");
        System.out.println(result1);

    }
}
