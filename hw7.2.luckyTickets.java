package com.company;

public class Main {

    public static void main(String[] args) {
        int lucky = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 1;

            for (int i = 0; i < 999999; i++) {
                if (n1 + n2 + n3 == n4 + n5 + n6) {
                    lucky++;
                    System.out.print(n1);
                    System.out.print(n2);
                    System.out.print(n3 + " ");
                    System.out.print(n4);
                    System.out.print(n5);
                    System.out.print(n6 + "   ");
                    System.out.println("lucky = " + lucky);
                }
                n6++;
                if (n6 % 10 == 0) {
                    n6 = 0;
                    n5++;
                }
                if (n5 == 10) {
                    n5 = 0;
                    n4++;
                }
                if (n4 == 10) {
                    n4 = 0;
                    n3++;
                }
                if (n3 == 10) {
                    n3 = 0;
                    n2++;
                }
                if (n2 == 10) {
                    n2 = 0;
                    n1++;
                }
            }
        System.out.println("amount of lucky tickets is: "+lucky);
    }
}
