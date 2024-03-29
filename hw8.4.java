package com.company;

import java.util.Random;

public class Main {
    private static final int MAX_COUNT = 10000;
    private static int operationCount = 0;

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        int[] arr = new int[MAX_COUNT];
        createArrayAndInit(arr);
        sortBubble(arr);
        time(time);
        sortSelect(arr);
        time(time);
        sortInsert(arr);
        time(time);
    }
    private static void time(long time) {
        time = System.currentTimeMillis() - time;
        System.out.println("Time:  " + time / 1000.0 + "  seconds\n");
    }

    private static void sortBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            operationCount++;
            for (int j = 0; j < arr.length - i - 1; j++) {
                operationCount++;
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Operation count sortBubble: " + operationCount);
    }
    private static void sortInsert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            operationCount++;
            int j = i - 1;
            while (j >= 0 && arr[i] < arr[j]) {
                operationCount++;
                arr[j + 1] = arr[j];
                j--;
            }
        }
        System.out.println("Operation count sortInsert: " + operationCount);
    }
    private static void sortSelect(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            operationCount++;
            for (int j = i + 1; j < arr.length; j++) {
                operationCount++;
                if (arr[j] < arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("Operation count sortSelect: " + operationCount);
    }
    private static void createArrayAndInit(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }
}
