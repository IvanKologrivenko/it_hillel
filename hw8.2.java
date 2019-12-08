package com.company;

public class Main {

    public static void main(String[] args) {

            String string = "niCe tO mEEt YOu!";
            String newString = getBigFirstChar(string);
            System.out.println(newString);
        }
        private static String getBigFirstChar(String s) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                int shift = 'a' - 'A';
                char chTemp;
                if (i == 0 && s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    chTemp = (char) (s.charAt(i) - shift);
                    sb.append(chTemp);
                } else if (s.charAt(i) == ' ') {

                    if (s.charAt(i + 1) >= 'a' && s.charAt(i + 1) <= 'z') {
                        chTemp = (char) (s.charAt(i + 1) - shift);
                    } else {
                        chTemp = s.charAt(i + 1);
                    }
                    sb.append(' ').append(chTemp);
                    i++;

                } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    chTemp = (char) (s.charAt(i) + shift);
                    sb.append(chTemp);
                } else {
                    chTemp = s.charAt(i);
                    sb.append(chTemp);
                }
            }
            return sb.toString();
        }
    }
