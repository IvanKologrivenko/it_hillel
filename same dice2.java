package com.company;

import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();
    public static final int COUNT = 1000000;

    public static void main(String[] args) {

        int count = 0;
        for (int i = 0; i < COUNT; i++) {
            int dice1 = dice();
            int dice2 = dice();
            if (dice1 == 6 && dice2 == 6) {
                count++;
            }
        }

        double probability = count / (double)COUNT * 100 * 6;

        System.out.println("Вероятность выпадения 2 одинаковых чисел:\n " + probability + "%");
    }

    private static int dice() {
        return RANDOM.nextInt(6) + 1;
    }

}
