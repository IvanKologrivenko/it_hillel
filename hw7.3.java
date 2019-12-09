package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] oldArray = arrayInit();
        System.out.println(Arrays.toString(oldArray));
        int[] newArray = getBiggerAverage(oldArray);
        System.out.println("new array is:\n " + Arrays.toString(newArray));
    }
    private static int[] arrayInit() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(20);
        }
        return arr;
    }
    private static int[] getBiggerAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double)sum / array.length;
        System.out.println("Average of old array is: \n" + average);
        int newArrayIndex = 0;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                newArray[newArrayIndex] = array[i];
                newArrayIndex++;
            }
        }
        return Arrays.copyOfRange(newArray, 0, newArrayIndex);
    }
}
