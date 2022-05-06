package com.allen.test;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome two_way = new Palindrome();
        String output = two_way.reversal("Abba");
        System.out.println(output);

    }

    public String reversal(String name) {

        String palin = "the palindrome is " + name;


        

        return palin ;
    }
}
