package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                if (i == 99) {
                    System.out.print("Hello");
                } else {
                    System.out.print("Hello ");
                }
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.print("World ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("HelloWorld ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
