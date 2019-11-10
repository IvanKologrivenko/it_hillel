package com.company;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("enter your first name:");

        Scanner s1 = new Scanner (System.in);

        String name1 = s1.nextLine();



        System.out.println("enter your middle name:");

        Scanner s2 = new Scanner (System.in);

        String name2 = s2.nextLine();



        System.out.println("enter your last name:");

        Scanner s3 = new Scanner (System.in);

        String name3 = s3.nextLine();

        

        System.out.println();

        System.out.print( name1 + "\n" + name2 + "\n" + name3 );

    }
}
