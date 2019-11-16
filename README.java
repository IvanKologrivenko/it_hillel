package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("enter first cathet:");

            Scanner scanner1 = new Scanner(System.in);

            int cathet1 = scanner1.nextInt();


        System.out.println("enter second cathet:");

            Scanner scanner2 = new Scanner(System.in);

            int cathet2 = scanner2.nextInt();


            double i = Math.hypot(cathet1,cathet2);

        System.out.println("hypotenuse is:\n" + i );

    }
}
