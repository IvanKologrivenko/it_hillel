package com.company;

public class Main {
    private static final double AMOUNT = 100;
    private static final int YEARS = 10;
    private static final double PERCENT = 1.5;

    public static void main(String[] args) {
        int months = YEARS * 12;
        double money = totalSum(AMOUNT, months, PERCENT);
        System.out.printf("Total sum is going to be %.2f", money);
    }
    private static double totalSum(double amount, int months, double percent) {
        for (int i = 0; i < months; i++) {
            amount = amount + amount * percent / 100;
        }
        return amount;
    }
}
