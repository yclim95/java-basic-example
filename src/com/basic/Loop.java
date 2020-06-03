package com.basic;

public class Loop {
    public static void main(String[] args) {
        int x = 64;

        int y = 0;

        while (x % 2 == 0) {

            y++;

            x = x / 2;

        }

        System.out.println(x + " " + y);
    }
}
