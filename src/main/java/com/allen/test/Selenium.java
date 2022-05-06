package com.allen.test;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/Users/allen/Documents/Selenium/Driver/geckodriver");

        FirefoxDriver webdriver = new FirefoxDriver();
        webdriver.get("https://www.amazon.in/");
        Thread.sleep(3000);

        webdriver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        webdriver.findElement(By.xpath("//input[@class=\"a-input-text a-span12 auth-autofocus auth-required-field\"]"))
                .sendKeys("9840584686");
        webdriver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        webdriver.findElement(By.xpath("//input[@class=\"a-input-text a-span12 auth-autofocus auth-required-field\"]"))
                .sendKeys("9840584686");
        webdriver.findElement(By.xpath("//input[@class=\"a-button-input\"]")).click();

        // String output = webdriver.getTitle();

        // System.out.println("the title is; " + output);
        // webdriver.close();

       // echo 'export webdriver.gecko.driver=/Users/allen/Documents/Selenium/Driver/geckodriver' >> ~/.zshenv

    }
}