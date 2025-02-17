/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject4;

/**
 *
 * @author IT20
 */


import java.util.Scanner;

public class Mavenproject4 {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
       
        System.out.println("Enter the first number:");
        int a = add.nextInt();
       
        System.out.println("Enter the second number:");
        int b = add.nextInt();
       
        System.out.println("Addition of two numbers = " + (a + b));
       
        add.close();
    }
}