package com.company;

public class Main {

    public static void main(String[] args) {
        final String STR1 = "I love JAVA";
        final String STR2 = "I LOVE JAVA";
        
        //charAt()
        char result = STR1.charAt(5);
        System.out.println("fifth character of String is:  " + result);
        System.out.println();
        
        //contains()
        boolean a1 = STR1.contains("love");
        System.out.println("String contains 'love' : " + a1);
        boolean a2 = STR1.contains("fate");
        System.out.println("String contains 'fate' : " + a2);
        System.out.println();

        //endsWith()
        boolean b1 = STR1.endsWith("love");
        System.out.println("String " + STR1 + " ends with 'love'?  " + b1);
        boolean b2 = STR1.endsWith("java");
        System.out.println("String " + STR1 + " ends with 'java'?  " + b2);
        System.out.println();

        //startsWith()
        boolean c1 = STR1.startsWith("I love");
        System.out.println("String " + STR1 + " starts with 'I love'?  " + c1);
        boolean c2 = STR1.startsWith("java");
        System.out.println("String " + STR1 + " starts with 'java'?  " + c2);
        System.out.println();

        //equals()
        System.out.println("String '" + STR1 + "' equals '" + STR2 + "' : " + STR1.equals(STR2));
        System.out.println();

        //equalsIgnoreCase()
        System.out.println("String '" + STR1 + "' equalsIgnoreCase '" + STR2 + "' : " + STR1.equalsIgnoreCase(STR2));
        System.out.println();

        //indexOf()
        int index = STR1.indexOf("JAVA");
        System.out.println(index);
        System.out.println();

        //isEmpty()
        if (STR1 == null || STR1.isEmpty ()) {
            System.out.println ("String STR1 is empty");
        } else {
            System.out.println (STR1);
        }
        System.out.println();

        //length()
        System.out.println ("length of String is:  " + STR1.length ());
        System.out.println();

        //replace()
        System.out.println (STR1.replaceFirst ("love", "like"));
        System.out.println();

        //substring()
        System.out.println (STR1.substring (7, 11));
        System.out.println();

        //toLowerCase()
        System.out.println(STR1.toLowerCase());
        System.out.println();

        //toUpperCase()
        System.out.println(STR1.toUpperCase());
        System.out.println();

        //trim()
        String s = "     Hello java     ";
        System.out.println(s.trim());
        System.out.println();
    }
}
