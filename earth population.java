package com.company;

public class Main {

    public static void main(String[] args) {

        /*earth population2019 = a
          earth population2020 = b
          earth population2021 = c
          earth population2022 = d */

        float k = 1.1f;
        long a = 7500000000L;
        long b = (long) (a * k);
        long c = (long) (b * k);
        long d = (long) (c * k);


        System.out.println("the population of the earth in 3 years will be:");
        System.out.println(d);
        
    }
}
