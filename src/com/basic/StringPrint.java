package com.basic;

public class StringPrint {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Escape Sequence\n");
        System.out.print("Tab\t Tab\n");


        // Comparison between 2 strings
        String a = "";

        a += "0";

        if (a == "0") {

            System.out.println("a is 0!");

        } else if (a == "1") {

            System.out.println("a is 1!");

        } else if (a == "a") {

            System.out.println("a is a!");

        } else {

            System.out.println("a is something else!"); // answer

        }

        // Comparion Between 2 Strings
        if (a.equals("0")) {

            System.out.println("a is 0!");

        } else if (a.equals("1")) {

            System.out.println("a is 1!");

        } else if (a.equals("a")) {

            System.out.println("a is a!");

        } else {

            System.out.println("a is something else!");

        }
    }
}
