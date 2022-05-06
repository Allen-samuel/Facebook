package com.allen.test;

import java.util.Scanner;

public class ReturnStatement {

    public static void main(String[] allenStrings) {
        Greetings Invitation = new Greetings();
        String Allen = Invitation.welcome("Paul");
        System.out.println(Allen);

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.next();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scan.close();
    }

}
