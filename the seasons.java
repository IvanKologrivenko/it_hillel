package com.company;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("enter month:");

        Scanner scanner = new Scanner (System.in);

        String month = scanner.nextLine();

        switch (month) {

            case "december" :
                System.out.println("winter");
                break;
            case "january" :
                System.out.println("winter");
                break;
            case "february" :
                System.out.println("winter");
                break;


            case "march" :
                System.out.println("spring");
                break;
            case "april" :
                System.out.println("spring");
                break;
            case "may" :
                System.out.println("spring");
                break;


            case "june" :
                System.out.println("summer");
                break;
            case "july" :
                System.out.println("summer");
                break;
            case "august" :
                System.out.println("summer");
                break;


            case "september" :
                System.out.println("autumn");
                break;
            case "october" :
                System.out.println("autumn");
                break;
            case "november" :
                System.out.println("autumn");
                break;

            default:
                System.out.println("you made a mistake when entering the month");
        }
    }
}
