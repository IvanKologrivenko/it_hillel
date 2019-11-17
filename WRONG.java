package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        private static void result (int length) {
        final int SIZE = 10;
            int[] myArray = new int[SIZE];
            Random random = new Random();
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = random.nextInt(100);
            }
            return myArray;
        }
    }
    }
