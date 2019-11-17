package com.company;

import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();
    public static final int COUNT = 1000000;

    public static void main(String[] args) {

        int count1 = 0;
        for (int i = 0; i < COUNT; i++) {
            int dice1 = dice();
            int dice2 = dice();
            if (dice1 == 1 && dice2 == 1) {
                count1++;
            }
        }

        int count2 = 0;
        for (int i = 0; i < COUNT; i++) {
            int dice1 = dice();
            int dice2 = dice();
            if (dice1 == 2 && dice2 == 2) {
                count2++;
            }
        }

        int count3 = 0;
        for (int i = 0; i < COUNT; i++) {
            int dice1 = dice();
            int dice2 = dice();
            if (dice1 == 3 && dice2 == 3) {
                count3++;
            }
        }

        int count4 = 0;
        for (int i = 0; i < COUNT; i++) {
            int dice1 = dice();
            int dice2 = dice();
            if (dice1 == 4 && dice2 == 4) {
                count4++;
            }
        }

        int count5 = 0;
        for (int i = 0; i < COUNT; i++) {
            int dice1 = dice();
            int dice2 = dice();
            if (dice1 == 5 && dice2 == 5) {
                count5++;
            }
        }

        int count6 = 0;
        for (int i = 0; i < COUNT; i++) {
            int dice1 = dice();
            int dice2 = dice();
            if (dice1 == 6 && dice2 == 6) {
                count6++;
            }
        }

        double probability = (count1 + count2 + count3 + count4 + count5 + count6) / (double)COUNT * 100;

        System.out.println("Вероятность выпадения 2 одинаковых чисел:\n " + probability + "%");
    }

    private static int dice() {
        return RANDOM.nextInt(6) + 1;
    }

}
