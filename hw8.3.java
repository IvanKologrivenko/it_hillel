package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final int SIZE = 8;
    public static void main(String[] args) {
        int number = '9' - '0' + 1;
        int bigChar = 'Z' - 'A' + 1;
        int littleChar = 'z' - 'a' + 1;
        int size = number + bigChar + littleChar + 1;
        char[] arr1 = new char[size];
        arr1[0] = '_';
        for (int i = 1; i <= number; i++) {
            for (int j = '0'; j <= '9'; i++) {
                arr1[i] = (char) j;
                j++;
            }
        }
        for (int i = number + 1; i <= number + bigChar; i++) {
            for (int j = 'A'; j <= 'Z'; i++) {
                arr1[i] = (char) j;
                j++;
            }
        }
        for (int i = number + bigChar + 1; i <= arr1.length; i++) {
            for (int j = 'a'; j <= 'z'; i++) {
                arr1[i] = (char) j;
                j++;
            }
        }
        char[] password = new char[SIZE];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        do {
            for (int i = 0; i < password.length; i++) {
                int arr1Index = new Random().nextInt(arr1.length);
                password[i] = arr1[arr1Index];
                
                if (password[i] >= '0' && password[i] <= '9') {
                    count1++;
                }
                if (password[i] >= 'A' && password[i] <= 'Z') {
                    count2++;
                }
                if (password[i] >= 'a' && password[i] <= 'z') {
                    count3++;
                }
            }
        }
        while (count1 == 0 || count2 == 0 || count3 == 0);
        System.out.println(Arrays.toString(password));
    }
}
