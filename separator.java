package com.company;

public class Main {

    public static void main(String[] args) {
        printLine( "++");
        System.out.println(printLine("++"));
    }
    private static String printLine(String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append(i);
            if (i != 100) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }
        }
