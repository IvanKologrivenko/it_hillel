package com.company;

public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        for (int i = a; i < b; i++) {
            if (i % 17 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
