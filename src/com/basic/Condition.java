package com.basic;

public class Condition {
    public static void main(String[] args) {
        int a = 10;

        int b = 30;

        if (a * 2 < b) {

            a = a * 3;

        }

        if (b < a) {

            b++;

        } else {

            a--;

        }

        System.out.println(a + " " + b);
    }
}
