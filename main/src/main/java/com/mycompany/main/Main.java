package com.mycompany.main;

public class Main {

    public static void main(String[] args) {

        double x = 0;
        while (x > 2) {
            System.out.println(x);
            while (x < 1) {
                x = Math.random();
            }
        }

        if (x == 2) {
            System.out.println("Hello World");
        } else {
            System.out.println("Nah");
        }
    }
}
