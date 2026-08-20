/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifstatementlab_arobo_ralph;

/**
 *
 * @author student
 */
import java.util.Scanner;

public class Ifstatementlab_arobo_ralph {
    public static void main(String[] args) {
        // Problem 1: Age Category Checker
        try (Scanner input = new Scanner(System.in)) {
            // Problem 1: Age Category Checker
            System.out.println("Age Check");
            System.out.print("Enter your age: ");
            int age = input.nextInt();
            
            if (age < 13) {
                System.out.println("Oops, you are a child.");
            } else if (age <= 19) {
                System.out.println("Good, you are a teenager.");
            } else {
                System.out.println("Oh.., you are an adult.");
            }
            
            // Problem 2: Temperature Evaluator
            System.out.println("Temperature Evaluator");
            System.out.print("Enter today's temperature in Celsius: ");
            double temp = input.nextDouble();
            
            if (temp < 0) {
                System.out.println("Freezing point.");
            } else if (temp <= 25) {
                System.out.println("Normal weather.");
            } else {
                System.out.println("Hot weather.");
            }
            
            // Problem 3: Simple Grade Evaluator
            System.out.println("Grade Evaluator");
            System.out.print("Enter your test score (out of 100): ");
            int score = input.nextInt();
            
            if (score >= 90) {
                System.out.println("Excellent");
            } else if (score >= 75) {
                System.out.println("Good");
            } else {
                System.out.println("Needs Improvement");
            }
            
            // Problem 4: Circle Calculator
            System.out.println("Circle Calculator");
            System.out.print("Enter the radius of a circle: ");
            double radius = input.nextDouble();
            
            if (radius <= 0) {
                System.out.println("Invalid radius.");
            } else {
                double area = Math.PI * radius * radius;
                double circumference = 2 * Math.PI * radius;
                System.out.printf("Area: %.2f\n", area);
                System.out.printf("Circumference: %.2f\n", circumference);
            }
            
            // Problem 5: Even or Odd Number
            System.out.println("Even or Odd Number");
            System.out.print("Enter an integer: ");
            int num = input.nextInt();
            
            if (num % 2 == 0) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
        }
    }
}
