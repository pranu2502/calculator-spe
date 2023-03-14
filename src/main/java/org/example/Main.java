package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            System.out.println("Welcome to the Calculator App");
            System.out.println("Please enter your selected choice");
            System.out.println("1. Calculate Square root");
            System.out.println("2. Factorial Function");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power of a function");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);

            Calculator calculator = new Calculator();
            int op = sc.nextInt();
            double num1, num2;

            while(op != 0)
            {
                switch (op)
                {
                    case 1:
                        System.out.println("Enter a number");
                        num1 = sc.nextDouble();
                        System.out.println("Square Root of " + String.valueOf(num1) + " is " + calculator.squareRoot(num1));

                    case 2:
                        System.out.println("Enter a number");
                        num1 = sc.nextDouble();
                        System.out.println("Square Root of " + String.valueOf(num1) + " is " + calculator.factorial(num1));


                    case 3:
                        System.out.println("Enter a number");
                        num1 = sc.nextDouble();
                        System.out.println("Natural Logarithm of " + String.valueOf(num1) + " is " + calculator.logarithm(num1));

                    case 4:
                        System.out.println("Enter a number for the base");
                        num1 = sc.nextDouble();
                        System.out.println("Enter a number for the power");
                        num2 = sc.nextDouble();
                        System.out.println("Value of " + String.valueOf(num1) + " to the power of " + String.valueOf(num2) + " is " + calculator.power(num1, num2));

                    default:
                        break;
                }

                op = sc.nextInt();
            }

        }
}