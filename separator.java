package com.company;

public class Main {

    private static final int INT = 100;

    public static void main(String[] args) {
        printLine( "++");
        System.out.println(printLine("++"));
    }
    private static String printLine(String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= INT; i++) {
            sb.append(i);
            if (i != INT) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }
        }
