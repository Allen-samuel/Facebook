package com.allen.test;

public class Greetings {

    public static void main(String[] args) {
    Greetings greeting = new Greetings();
    String output = greeting.welcome("Allen");
System.out.println(output);


    }

public String welcome (String name){
 String welcome_string = "welcome to java" + name;
 
 
    





 return welcome_string;

}

}
