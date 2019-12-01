package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[6][8];
        Random random = new Random();
        for (int i=0;i < matrix.length;i++) {
            for (int j=0;j < matrix[i].length;j++) {
                matrix[i][j]=random.nextInt(100);
            }
        }
        for (int i=0;i < matrix.length;i++,System.out.println()) {
            for (int j=0;j < matrix[i].length;j++) {
                System.out.print(matrix[i][j]+"  ");
            }
        }
    }
}
