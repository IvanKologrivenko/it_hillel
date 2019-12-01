package com.company;

public class Main {

    public static void main(String[] args) {
        double[] myList = { 8, 5, 42, 4, 13, 8, 6, 15, 24, 63 };
        double average = getAverage(myList);
        System.out.println(average);
    }

    private static double getAverage(double... intArr) {
        double average = 0;
        for (int i = 0; i < intArr.length; i++) {
            average += intArr[i];
        }
        return average / intArr.length;
    }
}
