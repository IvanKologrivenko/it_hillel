package com.company;

public class Main {

    public static void main(String[] args) {
        int shot = 0;
        int symmetry = 0;
        int h1 = 0;
        int h2 = 0;
        int m1 = 0;
        int m2 = 0;

        while (shot < 24 * 60) {

            if (h1 == m2 && h2 == m1) {
                symmetry++;
                System.out.print (h1);
                System.out.print (h2+":");
                System.out.print (m1);
                System.out.print (m2+" ");
                System.out.println("symmetry = "+symmetry);
            }
            m2++;
            if (m2%10==0){
                m2=0;
                m1++;
            }
            if (m1==6){
                m1=0;
                h2++;
            }
            if (h2>0 && h2%10==0){
                h2=0;
                h1++;
            }
            if (h1==2 && h2==4){
                break;
            }
            shot++;
        }
        System.out.println("Amount coincidence is: "+symmetry);
    }
}
