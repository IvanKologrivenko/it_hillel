package com.company;

public class Main {

    public static void main(String[] args) {
       String s = "gha@elDghb-raKeb&nPha#e";
        System.out.println(toUpperCase(s));
    }
    private static String toUpperCase (String line) {
        StringBuilder sb = new StringBuilder();
        int diff = 'a' - 'A';
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char newChar = (char) (ch - diff);
                sb.append(newChar);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
        }
}
