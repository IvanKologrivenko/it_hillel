package com.company;

public class Main {

    public static void main(String[] args) {

        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = myArray.length - i;

            System.out.println(myArray[i]);
        }
    }
}
